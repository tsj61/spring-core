package org.example.homework.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class FormalGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Welcome, " + name;
    }
}
