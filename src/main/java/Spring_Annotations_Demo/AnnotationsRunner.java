package Spring_Annotations_Demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AnnotationsRunner implements CommandLineRunner {

    private final DemoService demoService;
    private final DemoComponent demoComponent;
    private final ExternalLibraryClass externalLibraryClass;

    public AnnotationsRunner(DemoService demoService, 
                             DemoComponent demoComponent, 
                             ExternalLibraryClass externalLibraryClass) {
        this.demoService = demoService;
        this.demoComponent = demoComponent;
        this.externalLibraryClass = externalLibraryClass;
    }

    @Override
    public void run(String... args) {
        demoService.process();
        demoComponent.doWork();
        externalLibraryClass.print();
    }
}
