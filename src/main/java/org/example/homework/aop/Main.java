package org.example.homework.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("org.example.homework.aop");

        UserService userService = applicationContext.getBean(UserService.class);
        userService.updateName("Jeja");
        userService.updateEmail("Jeja@jeja.jeja");

        userService.updateName(null);
        userService.updateEmail(null);

        applicationContext.close();
    }
}
