package org.example.homework.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        final String name = "Julia";

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(GreetingConfig.class);

        GreetingPrinterConstructor printerConstructor = applicationContext.getBean(GreetingPrinterConstructor.class);
        printerConstructor.print(name);

        GreetingPrinterField printerField = applicationContext.getBean(GreetingPrinterField.class);
        printerField.print(name);

        GreetingPrinterSetter printerSetter = applicationContext.getBean(GreetingPrinterSetter.class);
        printerSetter.print(name);
    }
}
