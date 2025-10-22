package tsapaeva.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;
import tsapaeva.dev.aop.Loggable;

@Component
public class TaskManager {
    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("TaskManager postConstruct()");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("TaskManager preDestroy()");
    }

    @Loggable(value = "ERROR", times = 5)
    public Integer printTask() {
        System.out.println("Current task: " + task.toString());
        return task.getDuration();
    }

    public void throwEx(){
        throw new RuntimeException("Exception in TaskManager");
    }
}
