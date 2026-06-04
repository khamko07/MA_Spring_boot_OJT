package Spring_Core;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {
    public LifecycleBean() {
        System.out.println("1. Constructor");
    }

    @PostConstruct
    public void init() {
        System.out.println("2. @PostConstruct");
    }

    public void doWork() {
        System.out.println("3. Doing work");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("4. @PreDestroy");
    }
}
