package Spring_Core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringCoreRunner implements CommandLineRunner {

    private final ApplicationContext context;
    private final LifecycleBean lifecycleBean;

    public SpringCoreRunner(ApplicationContext context, LifecycleBean lifecycleBean) {
        this.context = context;
        this.lifecycleBean = lifecycleBean;
    }

    @Override
    public void run(String... args) {
        System.out.println("--- Scopes ---");
        MySingletonBean s1 = context.getBean(MySingletonBean.class);
        MySingletonBean s2 = context.getBean(MySingletonBean.class);
        System.out.println("Singleton same instance? " + (s1 == s2));

        MyPrototypeBean p1 = context.getBean(MyPrototypeBean.class);
        MyPrototypeBean p2 = context.getBean(MyPrototypeBean.class);
        System.out.println("Prototype same instance? " + (p1 == p2));

        System.out.println("--- Lifecycle ---");
        lifecycleBean.doWork();
    }
}
