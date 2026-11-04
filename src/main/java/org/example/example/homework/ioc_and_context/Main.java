package org.example.example.homework.ioc_and_context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserMessagePrinter userMessagePrinter = applicationContext.getBean(UserMessagePrinter.class);
        userMessagePrinter.printMessage("ИмяЛюбое");
    }
}
