package org.example.homework.bean_lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class AppLogger {

    public AppLogger() {
        System.out.println("AppLogger constructor");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("AppLogger post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("AppLogger pre destroy");
    }
}
