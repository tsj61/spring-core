package org.example.practice.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope("prototype")
public class Task {

    private final String name;
    private final Long duration;

    public Task() {
        this.name = "task-" + ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
        System.out.println("call task constructor");
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
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
