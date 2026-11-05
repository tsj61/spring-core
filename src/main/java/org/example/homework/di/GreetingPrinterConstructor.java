package org.example.homework.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterConstructor {

    private final GreetingService greetingService;

    @Autowired
    public GreetingPrinterConstructor(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void print(String name) {
        System.out.println(greetingService.greet(name));
    }
}
