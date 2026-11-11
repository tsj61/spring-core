package org.example.practice.property;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Task {

    private final String name;
    private final Integer duration;

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration
    ) {
        this.name = name;
        this.duration = duration;
        System.out.println("call task constructor");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
        return duration;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Task post construct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Task pre destroy");
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
