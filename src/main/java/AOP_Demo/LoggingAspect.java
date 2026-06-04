package AOP_Demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* AOP_Demo.UserService.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] Before method: " + joinPoint.getSignature().getName());
    }

    @After("execution(* AOP_Demo.UserService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[LoggingAspect] After method: " + joinPoint.getSignature().getName());
    }
}
