package tsapaeva.dev.model;

import java.io.Serial;
import java.io.Serializable;

public class Task implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String id;

    private String description;

    private boolean isCompleted = false;

    public Task(String id, String description, boolean isCompleted) {
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    @Override
    public String toString() {
        return id + " | " + description + " | " + isCompleted;
    }
}
