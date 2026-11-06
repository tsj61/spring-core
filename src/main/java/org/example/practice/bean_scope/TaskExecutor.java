package org.example.practice.bean_scope;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

    private final ObjectProvider<Task> taskProvider;

    public TaskExecutor(ObjectProvider<Task> taskProvider) {
        this.taskProvider = taskProvider;
    }

    public Task getTask() {
        return taskProvider.getObject();
    }

/*
    Так бин создастся только 1 раз!

    private final Task task;

    @Autowired
    public TaskExecutor(Task task) {
        this.task = task;
    }
*/

    public void executeTask() {
        Task task =  getTask();
        System.out.printf(
                "Execute task with name %s, total seconds %s%n",
                task.getName(),
                task.getDuration()
        );
    }
}
