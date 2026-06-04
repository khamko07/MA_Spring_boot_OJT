package Spring_Annotations_Demo;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {
    public void doWork() {
        System.out.println("DemoComponent working");
    }
}
