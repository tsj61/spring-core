package tsapaeva.dev.task_app.eventlistener.listener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import tsapaeva.dev.task_app.eventlistener.event.SaveTaskEvent;
import tsapaeva.dev.task_app.service.TaskService;

@Component
public class SaveTaskEventListener {

    @Value("${app.tasks-file-path}")
    private String filePath;

    private final TaskService taskService;

    public SaveTaskEventListener(TaskService taskService) {
        this.taskService = taskService;
    }

    @EventListener(SaveTaskEvent.class)
    public void onEvent(SaveTaskEvent event) {
        System.out.println("Save tasks");
        taskService.saveTask(filePath);
    }
}
