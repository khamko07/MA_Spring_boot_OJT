package Output_OJT_MA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = {"Output_OJT_MA"})
@RestController
public class MaOjtGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MaOjtGradleApplication.class, args);
	}

    @GetMapping("/")
    public String hello() {
        return "Hello Spring Boot Test (Running from Gradle)";
    }
}
