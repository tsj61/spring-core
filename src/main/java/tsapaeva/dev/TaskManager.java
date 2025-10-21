package tsapaeva.dev;

public class TaskManager {
    private final Task task;

    public TaskManager(Task task) {
        this.task = task;
    }

    public void printTask() {
        System.out.println("Current task: " + task.toString());
    }
}
