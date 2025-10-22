package tsapaeva.dev;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("tsapaeva.dev");

        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();
        taskManager.throwEx();

        context.close();
    }
}