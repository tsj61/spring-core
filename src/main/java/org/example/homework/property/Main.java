package org.example.homework.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.homework.property");

        PlannerService plannerService = applicationContext.getBean(PlannerService.class);
        System.out.println(plannerService.printConfig());

        applicationContext.close();
    }
}
