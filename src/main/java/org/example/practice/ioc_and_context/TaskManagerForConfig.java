package org.example.practice.ioc_and_context;

import org.springframework.beans.factory.annotation.Autowired;

public class TaskManagerForConfig {

    private final TaskForConfig task;

    @Autowired
    public TaskManagerForConfig(TaskForConfig task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }
}