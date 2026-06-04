package Spring_Annotations_Demo;

import org.springframework.stereotype.Service;

@Service
public class DemoService {
    private final DemoRepository repo;
    
    public DemoService(DemoRepository repo) {
        this.repo = repo;
    }
    
    public void process() {
        System.out.println("Service processing: " + repo.getData());
    }
}
