package tsapaeva.dev.task_app.eventlistener.event;

import org.springframework.context.ApplicationEvent;

public class SaveTaskEvent extends ApplicationEvent {
    public SaveTaskEvent(Object source) {
        super(source);
    }
}
