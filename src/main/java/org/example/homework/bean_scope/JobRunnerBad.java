package org.example.homework.bean_scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobRunnerBad {

    private final TaskContext taskContext;

    @Autowired
    public JobRunnerBad(TaskContext taskContext) {
        this.taskContext = taskContext;
    }

    public void runOnce() {
        System.out.println(taskContext.getId());
    }
}
