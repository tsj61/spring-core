package org.example.homework.bean_scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JobRunnerGood {

    private final ObjectProvider<TaskContext> taskContext;

    @Autowired
    public JobRunnerGood(ObjectProvider<TaskContext> taskContext) {
        this.taskContext = taskContext;
    }

    private TaskContext getTaskContext(){
        return taskContext.getObject();
    }

    public void runOnce() {
        System.out.println(getTaskContext().getId());
    }
}
