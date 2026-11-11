package org.example.practice.property;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.practice.property");

        TaskProperties configurationProperties = applicationContext.getBean(TaskProperties.class);
        System.out.println(configurationProperties);
    }
}
