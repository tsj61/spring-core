package org.example.homework.bean_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component
@Scope("prototype")
public class TaskContext {

    private final Long id = ThreadLocalRandom.current().nextLong(100);

    public Long getId() {
        return id;
    }
}
