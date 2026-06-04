package Spring_Annotations_Demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {
    @Bean
    public ExternalLibraryClass externalLibraryClass() {
        return new ExternalLibraryClass();
    }
}
