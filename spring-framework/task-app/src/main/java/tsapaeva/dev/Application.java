package tsapaeva.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import tsapaeva.dev.eventlistener.event.SaveTaskEvent;
import tsapaeva.dev.service.TaskService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }

    private void start() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TaskService taskService = context.getBean(TaskService.class);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add task");
            System.out.println("2. Complete task");
            System.out.println("3. List of tasks");
            System.out.println("4. Save tasks");
            System.out.println("5. Exit");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Task description");
                    String desc = scanner.nextLine();
                    taskService.addTask(desc);
                    break;
                case 2:
                    System.out.print("Enter taskId to complete: ");
                    String taskId = scanner.nextLine();
                    taskService.completeTask(taskId);
                    break;
                case 3:
                    System.out.println("Tasks: ");
                    taskService.getAllTasks().forEach(task -> {
                        System.out.println(task.toString());
                    });
                    break;
                case 4:
                    context.publishEvent(new SaveTaskEvent(this));
                    break;
                case 5:
                    context.close();
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
