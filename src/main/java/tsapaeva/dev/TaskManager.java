package tsapaeva.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {
    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("TaskManager postConstruct()");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("TaskManager preDestroy()");
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }
}
