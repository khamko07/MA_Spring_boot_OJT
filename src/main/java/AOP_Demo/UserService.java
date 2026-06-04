package AOP_Demo;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void createUser(String name) {
        System.out.println("Creating user: " + name);
    }
    
    public void deleteUser(Long id) {
        System.out.println("Deleting user: " + id);
    }
}
