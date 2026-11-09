package org.example.practice.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext applicationContext =
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
