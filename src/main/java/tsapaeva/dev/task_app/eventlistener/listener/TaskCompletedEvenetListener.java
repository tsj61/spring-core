package tsapaeva.dev.task_app.eventlistener.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import tsapaeva.dev.task_app.eventlistener.event.TaskCompletedEvent;

@Component
public class TaskCompletedEvenetListener {

    @EventListener(TaskCompletedEvent.class)
    public void onEvent(TaskCompletedEvent taskCompletedEvent) {
        if (taskCompletedEvent.isCompleted()) {
            System.out.println("Event completed: " + taskCompletedEvent.getTaskId());
        } else {
            System.out.println("Event not completed: " + taskCompletedEvent.getTaskId());
        }
    }

}
