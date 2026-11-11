package org.example.homework.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PlannerService {

    @Value("${planner.enabled:false}")
    private boolean enabled;

    private final PlannerProperties plannerProperties;

    @Autowired
    public PlannerService(PlannerProperties plannerProperties) {
        this.plannerProperties = plannerProperties;
    }

    public String printConfig() {
        return "Enabled: %s, default duration: %s, batch size: %s"
                .formatted(
                        enabled,
                        plannerProperties.getDefaultDuration(),
                        plannerProperties.getBatchSize()
                );
    }
}
