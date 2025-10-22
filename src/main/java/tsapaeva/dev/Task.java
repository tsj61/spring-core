package tsapaeva.dev;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;

    public Task() {
        this.name = "task" + ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
