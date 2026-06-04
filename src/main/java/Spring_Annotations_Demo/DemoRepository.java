package Spring_Annotations_Demo;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String getData() {
        return "data from repo";
    }
}
