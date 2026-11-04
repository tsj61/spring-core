package org.example.practice.di;

public class Task {

    private final String name;
    private final Long duration;
    private TaskManager taskManager;

    public Task(TaskManager taskManager) {
        this.name = "task";
        this.duration = 60L;
        this.taskManager = taskManager;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

/*
    @Autowired
    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }
*/

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
