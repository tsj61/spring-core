package org.example.homework.di;

import org.springframework.stereotype.Service;

@Service
public class FriendlyGreetingService implements GreetingService {
    @Override
    public String greet(String name) {
        return "Great to see you, " + name;
    }
}
