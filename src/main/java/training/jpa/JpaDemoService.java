package training.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class JpaDemoService {

    @Autowired
    private UserRepository userRepository;

    public void demoJpaFeatures() {
        User newUser = new User("Khamko", "Khamko@gmail.com");
        userRepository.save(newUser);

        List<User> allUsers = userRepository.findAll();

        userRepository.findById(1L).ifPresent(user -> {
            System.out.println("Da tim thay User");
        });

    }
}
