package org.example.practice.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() throws RuntimeException, InterruptedException {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.practice.aop");

        TaskExecutor taskExecutor = applicationContext.getBean(TaskExecutor.class);
        taskExecutor.executeTask();

        System.out.println("-----------------------------------");

        TaskManager taskManager = applicationContext.getBean(TaskManager.class);
        taskManager.sleep();
        taskManager.printTask();
        taskManager.printException();

        applicationContext.close();
    }
}
