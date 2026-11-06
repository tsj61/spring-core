package org.example.practice.bean_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        if (task == null) {
            System.out.println("No current tast");
        } else {
            System.out.println("Current task: " + task);
        }
    }
}
