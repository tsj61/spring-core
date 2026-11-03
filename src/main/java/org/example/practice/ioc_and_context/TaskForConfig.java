package org.example.practice.ioc_and_context;

public class TaskForConfig {

    private final String name;
    private final Long duration;

    public TaskForConfig() {
        this.name = "task";
        this.duration = 60L;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "TaskForConfig{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
