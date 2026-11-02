package org.example.example.practice.ioc_and_context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        System.out.println("Main with context");
        mainWithContext();
        System.out.println();

        System.out.println("Main without context");
        mainWithoutContext();
        System.out.println();

        System.out.println("Main with config");
        mainWithConfig();
    }

    static void mainWithContext(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.example.practice.ioc_and_context");

        Task task = applicationContext.getBean(Task.class);
        System.out.println(task);

        Task task2 = (Task) applicationContext.getBean("task");
        System.out.println(task2);

        System.out.println(task == task2);

        TaskManager taskManager = applicationContext.getBean(TaskManager.class);
        taskManager.printTask();
    }

    static void mainWithoutContext() {
        Task task1 = new Task();
        TaskManager taskManager1 = new TaskManager(task1);
        taskManager1.printTask();
    }

    static void mainWithConfig() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TaskConfig.class);

        Task task = applicationContext.getBean(Task.class);
        System.out.println(task);

        Task task2 = (Task) applicationContext.getBean("task");
        System.out.println(task2);

        System.out.println(task == task2);

        TaskManager taskManager = applicationContext.getBean(TaskManager.class);
        taskManager.printTask();
    }
}
