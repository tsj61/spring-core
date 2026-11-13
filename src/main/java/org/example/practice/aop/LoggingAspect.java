package org.example.practice.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Aspect
public class LoggingAspect {

    @Before("@annotation(loggable)")
    public void log(
            JoinPoint joinPoint,
            Loggable loggable
    ) {
        for (int i = 0; i < loggable.times(); i++) {
            System.out.printf(
                    "LOG %s before method %s%n", loggable.value(),
                    joinPoint.getSignature().getName()
            );
        }
    }

    @Around("execution(* org.example.practice.aop.TaskManager.sleep())")
    public Object logAround(
            ProceedingJoinPoint joinPoint
    ) throws Throwable {
        System.out.println("Before execution : " + LocalDateTime.now());

        Object result = null;

        try {
            result = joinPoint.proceed();
        } catch (Throwable e) {
            //
            throw new RuntimeException();
        } finally {
            System.out.println("After execution : " + LocalDateTime.now());
        }

        return result;

    }

    @Before("execution(* org.example.practice.aop.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
            value = "execution(* org.example.practice.aop.TaskManager.*(..))",
            returning = "result"
    )
    public void logAfterReturning(
            JoinPoint joinPoint,
            Object result
    ) {
        System.out.println("After returning " + joinPoint.getSignature().getName() + " with object: " + result);
    }

    @AfterThrowing(
            value = "execution(* org.example.practice.aop.TaskManager.*(..))",
            throwing = "ex"
    )
    public void afterThrowing(
            Exception ex
    ) {
        System.out.println("After throwing " + ex.getMessage());
    }

    @After("execution(* org.example.practice.aop.TaskManager.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After execution " + joinPoint.getSignature().getName());
    }

}
