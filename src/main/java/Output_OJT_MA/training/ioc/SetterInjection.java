package Output_OJT_MA.training.ioc;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class SetterInjection {
    private BeanScopeSingleton bean;
    @Autowired
    public void setBean(BeanScopeSingleton bean) {
        this.bean = bean;
    }
}
