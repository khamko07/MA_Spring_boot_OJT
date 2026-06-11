package training.mvc_exercise;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {
    
    private Map<String, User> userDatabase = new HashMap<>();

    public UserService() {
        userDatabase.put("1", new User("1", "Nguyen Van A", "a@gmail.com"));
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(userDatabase.values());
    }

    public User getUserById(String id) {
        return userDatabase.get(id);
    }

    public User createUser(User user) {
        if (user.getId() == null || userDatabase.containsKey(user.getId())) {
            return null;
        }
        userDatabase.put(user.getId(), user);
        return user;
    }

    public User updateUser(String id, User updatedUser) {
        if (!userDatabase.containsKey(id)) {
            return null;
        }
        updatedUser.setId(id);
        userDatabase.put(id, updatedUser);
        return updatedUser;
    }

    public boolean deleteUser(String id) {
        if (userDatabase.containsKey(id)) {
            userDatabase.remove(id);
            return true;
        }
        return false;
    }
}
