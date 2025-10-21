package tsapaeva.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TaskConfig {

    @Bean("task")
    public Task task() {
        return new Task();
    }

    @Primary
    @Bean("secondTask")
    public Task task2() {
        return new Task();
    }

    @Bean
    public TaskManager taskManager(
            Task task
    ) {
        return new TaskManager(task);
    }
}
