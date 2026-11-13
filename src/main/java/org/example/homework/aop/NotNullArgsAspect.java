package org.example.homework.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NotNullArgsAspect {

    @Around("@annotation(notNullArgs)")
    public void notNull(
            ProceedingJoinPoint joinPoint,
            NotNullArgs notNullArgs
    ) throws Throwable {
        for (int i = 0; i < joinPoint.getArgs().length; i++) {
            if (joinPoint.getArgs()[i] == null) {
                throw new IllegalArgumentException("Argument is null in " + joinPoint.getSignature().getName());
            }
        }
        joinPoint.proceed();
    }
}
