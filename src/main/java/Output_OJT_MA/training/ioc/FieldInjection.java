package Output_OJT_MA.training.ioc;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class FieldInjection {
    @Autowired
    private BeanScopeSingleton bean;
}
