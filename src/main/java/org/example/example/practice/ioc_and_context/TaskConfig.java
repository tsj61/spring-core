package org.example.example.practice.ioc_and_context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public Task task() {
        return new Task();
    }

    @Bean
    public TaskManager taskManager(Task task) {
        return new TaskManager(task);
    }
}
