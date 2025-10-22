package tsapaeva.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Task {
    private final String name;
    private final Integer duration;
    private final List<String> listValues;
    private final Map<String, Integer> mapValues;

    public Task(
            @Value("${task.name}") String name,
            @Value("${task.duration}") Integer duration,
            @Value("#{'${task.list-values}'.split(',')}") List<String> listValues,
            @Value("#{${task.map-values}}") Map<String, Integer> mapValues) {
        this.name = name;
        this.duration = duration;
        this.listValues = listValues;
        this.mapValues = mapValues;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Task postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Task preDestroy()");
    }

    public String getName() {
        return name;
    }

    public Integer getDuration() {
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
