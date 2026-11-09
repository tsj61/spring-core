package org.example.practice.bean_lifecycle;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

    private final ObjectProvider<Task> taskProvider;

    public TaskExecutor(ObjectProvider<Task> taskProvider) {
        this.taskProvider = taskProvider;
    }

    public Task getTask() {
        return taskProvider.getObject();
    }

    public void executeTask() {
        Task task =  getTask();
        System.out.printf(
                "Execute task with name %s, total seconds %s%n",
                task.getName(),
                task.getDuration()
        );
    }
}
