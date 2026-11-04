package org.example.practice.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class TaskConfig {

    @Bean
    public Task task(
            @Lazy TaskManager taskManager
    ) {
        return new Task(taskManager);
    }

/*
    @Bean
    @Primary
    public Task task2() {
        return new Task();
    }*/

    @Bean
    public TaskManager taskManager(
            @Autowired(required = false) /*@Qualifier("task2")*/ Task task
    ) {
        return new TaskManager(task);
    }
}
