package org.example.homework.bean_scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.homework.bean_scope");

        JobRunnerBad jobRunnerBad = applicationContext.getBean(JobRunnerBad.class);
        jobRunnerBad.runOnce();
        jobRunnerBad.runOnce();
        jobRunnerBad.runOnce();

        JobRunnerGood jobRunnerGood = applicationContext.getBean(JobRunnerGood.class);
        jobRunnerGood.runOnce();
        jobRunnerGood.runOnce();
        jobRunnerGood.runOnce();


    }
}
