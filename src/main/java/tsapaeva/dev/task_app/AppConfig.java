package tsapaeva.dev.task_app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tsapaeva.dev.task_app")
@PropertySource("classpath:task_app_resources/task-application.properties")
public class AppConfig {
}
