package tsapaeva.dev.task_app.eventlistener.event;

import org.springframework.context.ApplicationEvent;

public class TaskCompletedEvent extends ApplicationEvent {

    private final String taskId;

    private final boolean isCompleted;

    public TaskCompletedEvent(Object source, String taskId, boolean isCompleted) {
        super(source);
        this.taskId = taskId;
        this.isCompleted = isCompleted;
    }

    public String getTaskId() {
        return taskId;
    }

    public boolean isCompleted() {
        return isCompleted;
    }
}
