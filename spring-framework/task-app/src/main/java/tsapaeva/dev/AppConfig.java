package tsapaeva.dev;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("tsapaeva.dev")
@PropertySource("classpath:task-application.properties")
public class AppConfig {
}
