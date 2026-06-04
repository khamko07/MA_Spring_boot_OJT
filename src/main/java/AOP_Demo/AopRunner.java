package AOP_Demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AopRunner implements CommandLineRunner {

    private final UserService userService;

    public AopRunner(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) {
        userService.createUser("John Doe");
        userService.deleteUser(1L);
    }
}
