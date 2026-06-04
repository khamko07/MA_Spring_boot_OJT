package bean;
import org.springframework.stereotype.Component;

@Component
public class Person {
    public void sayHello() {
        System.out.println("This is Person class");
    }
}
