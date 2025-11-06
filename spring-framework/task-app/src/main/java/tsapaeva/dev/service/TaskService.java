package tsapaeva.dev.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import tsapaeva.dev.eventlistener.event.TaskCompletedEvent;
import tsapaeva.dev.model.Task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    private final ApplicationEventPublisher publisher;

    private final List<Task> tasks = new ArrayList<>();

    public TaskService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void addTask(String description) {
        Task task = new Task(
                UUID.randomUUID().toString(),
                description,
                false
        );

        tasks.add(task);
    }

    public void completeTask(String taskId) {
        var completedTask = tasks.stream()
                .filter(t -> t.getId().equals(taskId))
                .findFirst();

        completedTask.ifPresent(t -> t.setCompleted(true));

        publisher.publishEvent(new TaskCompletedEvent(
                this,
                taskId,
                completedTask.map(Task::isCompleted).orElse(false)
        ));
    }

    public void saveTask(String filePath) {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(tasks);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.out.println("File not found in saveTask(): " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception in saveTask(): " + e.getMessage());
        }
    }

    public void loadTasks(String filePath) {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(filePath)) {

            if (inputStream == null) {
                System.out.println("File not found in loadTasks(): " + filePath);
                return;
            }

            try (ObjectInputStream ois = new ObjectInputStream(inputStream)) {
                tasks.addAll((List<Task>) ois.readObject());
                System.out.println("Loaded " + tasks.size() + " tasks from " + filePath);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException in loadTasks(): " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception in loadTasks(): " + e.getMessage());
        }
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
}
