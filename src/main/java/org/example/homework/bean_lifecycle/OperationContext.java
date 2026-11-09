package org.example.homework.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class OperationContext {

    public OperationContext() {
        System.out.println("OperationContext constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("OperationContext post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("OperationContext pre destroy");
    }
}
