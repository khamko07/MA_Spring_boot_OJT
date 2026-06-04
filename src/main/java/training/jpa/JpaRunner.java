package training.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaRunner implements CommandLineRunner {

    @Autowired
    private JpaDemoService jpaDemoService;

    @Override
    public void run(String... args) throws Exception {
        jpaDemoService.demoJpaFeatures();
    }
}
