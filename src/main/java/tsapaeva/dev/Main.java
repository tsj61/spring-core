package tsapaeva.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskConfig.class);

        Task task2 = (Task) context.getBean("task");
        System.out.println(task2.toString());

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();

    }
}