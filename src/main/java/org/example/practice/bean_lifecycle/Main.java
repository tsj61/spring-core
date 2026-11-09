package org.example.practice.bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.practice.bean_lifecycle");

        Task task1 = applicationContext.getBean(Task.class);

        TaskManager taskManager = applicationContext.getBean(TaskManager.class);
        taskManager.printTask();

        TaskExecutor taskExecutor = applicationContext.getBean(TaskExecutor.class);
        taskExecutor.executeTask();

        task1.preDestroy();
        applicationContext.close();
    }
}
