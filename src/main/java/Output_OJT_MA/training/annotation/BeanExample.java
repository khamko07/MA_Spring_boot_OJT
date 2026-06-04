package Output_OJT_MA.training.annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BeanExample {
    @Bean
    public String myBean() {
        return "Hello";
    }
}
