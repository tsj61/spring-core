package org.example.practice.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.practice.bean_scope");

        Task task1 = applicationContext.getBean(Task.class);
        Task task2 = applicationContext.getBean(Task.class);

        System.out.println(task1 == task2);

        TaskManager taskManager = applicationContext.getBean(TaskManager.class);
        taskManager.printTask();
        taskManager.printTask();

        TaskExecutor taskExecutor = applicationContext.getBean(TaskExecutor.class);
        taskExecutor.executeTask();
        taskExecutor.executeTask();
    }
}
