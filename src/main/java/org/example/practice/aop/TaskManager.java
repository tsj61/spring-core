package org.example.practice.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void printException() throws RuntimeException {
        throw new RuntimeException("THROW EXCEPTION");
    }

    @Loggable()
    public Integer printTask() {
        if (task == null) {
            System.out.println("No current tast");
            return 0;
        } else {
            System.out.println("Current task: " + task);
            return task.getDuration();
        }
    }
}
