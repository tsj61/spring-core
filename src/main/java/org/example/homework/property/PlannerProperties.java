package org.example.homework.property;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlannerProperties {

    private final int defaultDuration;

    private final int batchSize;

    public PlannerProperties(
            @Value("${planner.default-duration:0}") int defaultDuration,
            @Value("${planner.batch-size:1}") int batchSize
    ) {
        this.defaultDuration = defaultDuration;
        this.batchSize = batchSize;
    }

    public int getDefaultDuration() {
        return defaultDuration;
    }

    public int getBatchSize() {
        return batchSize;
    }

    @Override
    public String toString() {
        return "PlannerProperties{" +
                "defaultDuration=" + defaultDuration +
                ", batchSize=" + batchSize +
                '}';
    }
}
