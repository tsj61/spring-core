package org.example.homework.bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AppLogger appLogger1 = applicationContext.getBean(AppLogger.class);
        AppLogger appLogger2 = applicationContext.getBean(AppLogger.class);
        System.out.println(appLogger1 == appLogger2);

        OperationContext operationContext1 = applicationContext.getBean(OperationContext.class);
        OperationContext operationContext2 = applicationContext.getBean(OperationContext.class);
        OperationContext operationContext3 = applicationContext.getBean(OperationContext.class);
        System.out.println("operationContext1 == operationContext2 ? " + (operationContext1== operationContext2));

        operationContext1.preDestroy();

        applicationContext.close();
    }
}
