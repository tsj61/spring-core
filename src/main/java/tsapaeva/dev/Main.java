package tsapaeva.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tsapaeva.dev");

        Task task1 = (Task) context.getBean(Task.class);
        Task task2 = (Task) context.getBean(Task.class);
        System.out.println(task1.toString());
        System.out.println(task2.toString());

        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

        context.close();
    }
}