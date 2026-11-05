package org.example.homework.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingPrinterField {

    @Autowired
    @Qualifier("friendlyGreetingService")
    private GreetingService greetingService;

    public void print(String name) {
        System.out.println(greetingService.greet(name));
    }
}
