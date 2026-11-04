package org.example.practice.di;

import org.springframework.beans.factory.annotation.Autowired;

public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }

    /*
      @Autowired private Task task;
    */

    /*
    @Autowired
    public void setTask(Task task) {
        this.task = task;
    }
    */

    public void printTask() {
        if (task == null) {
            System.out.println("No current tast");
        } else {
            System.out.println("Current task: " + task.toString());
        }
    }
}
