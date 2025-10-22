package tsapaeva.dev.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* tsapaeva.dev.TaskManager.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Before: " + joinPoint.getSignature().getName());
    }

    @AfterReturning(
            value = "execution(* tsapaeva.dev.TaskManager.*(..))",
            returning = "result"
    )
    public void logAfterReturning(
            JoinPoint joinPoint,
            Object result
    ) {
        System.out.println("After returning result: " + joinPoint.getSignature().getName() + " Result:" + result);
    }

    @AfterThrowing(
            value = "execution(* tsapaeva.dev.TaskManager.*(..))",
            throwing = "ex"
    )
    public void afterThrowing(
            JoinPoint joinPoint,
            Exception ex
    ) {
        System.out.println("After throwing: " + ex.getMessage());
    }

    @After("execution(* tsapaeva.dev.TaskManager.*(..))")
    public void after(JoinPoint joinPoint) {
        System.out.println("After: " + joinPoint.getSignature().getName());
    }

    @Around("execution(* tsapaeva.dev.TaskManager.printTask(..))")
    public Object logAround(
            ProceedingJoinPoint proceedingJoinPoint
    ) throws Throwable {
        //тут логика
        System.out.println("Around BEFORE");
        Object result = proceedingJoinPoint.proceed(); // а тут именно вызов логики сервиса
        // и тут
        System.out.println("Around AFTER");
        return result;
    }

    @Before("@annotation(loggable)")
    public void log(
            JoinPoint joinPoint,
            Loggable loggable
    ) {
        for (int i = 1; i <= loggable.times(); i++) {
            System.out.println("LOGGABLE " + loggable.value());
        }
    }

}
