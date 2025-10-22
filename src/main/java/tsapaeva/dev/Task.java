package tsapaeva.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
public class Task {
    private final String name;
    private final Long duration;

    public Task() {
        this.name = "task" + ThreadLocalRandom.current().nextInt();
        this.duration = 60L;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Task postConstruct()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Task preDestroy()");
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
