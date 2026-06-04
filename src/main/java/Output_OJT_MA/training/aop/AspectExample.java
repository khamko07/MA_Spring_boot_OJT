package Output_OJT_MA.training.aop;
// Requires Spring AOP dependency
// import org.aspectj.lang.annotation.Aspect;
// import org.aspectj.lang.annotation.Before;
// import org.springframework.stereotype.Component;

// @Aspect
// @Component
public class AspectExample {
    // @Before("execution(* Output_OJT_MA.training..*(..))")
    public void beforeMethod() {
        System.out.println("Before method execution");
    }
}
