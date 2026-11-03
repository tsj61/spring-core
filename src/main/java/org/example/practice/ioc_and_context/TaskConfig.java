package org.example.practice.ioc_and_context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public TaskForConfig taskForConfig() {
        return new TaskForConfig();
    }

    @Bean
    public TaskManagerForConfig taskManagerForConfig(TaskForConfig task) {
        return new TaskManagerForConfig(task);
    }
}
