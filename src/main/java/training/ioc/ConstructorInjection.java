package training.ioc;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class ConstructorInjection {
    private final BeanScopeSingleton bean;
    @Autowired
    public ConstructorInjection(BeanScopeSingleton bean) {
        this.bean = bean;
    }
}
