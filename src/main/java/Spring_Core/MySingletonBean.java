package Spring_Core;

import org.springframework.stereotype.Component;

@Component
public class MySingletonBean {
    public MySingletonBean() {
        System.out.println("Singleton Bean created");
    }
}
