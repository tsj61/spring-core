package tsapaeva.dev.eventlistener.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import tsapaeva.dev.eventlistener.event.TaskCompletedEvent;

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
