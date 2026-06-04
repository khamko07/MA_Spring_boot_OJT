package Maven_Structure_Demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MavenRunner implements CommandLineRunner {
    @Override
    public void run(String... args) {
        System.out.println("Maven runner executed");
    }
}
