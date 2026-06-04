package test3Tier;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getName() {
        return "John";
    }
}
