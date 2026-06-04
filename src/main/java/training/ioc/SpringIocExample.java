package training.ioc;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Component
class IocEngine {
    public void start() {
        System.out.println("IoC Engine started");
    }
}

@Component
class IocCar {
    private IocEngine engine;

    // Không dùng 'new', Spring sẽ tự động tiêm object vào (DI)
    @Autowired
    public IocCar(IocEngine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("IoC Car is driving");
    }
}

@SpringBootApplication
public class SpringIocExample {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringIocExample.class, args);
        // Lấy object từ Container thay vì dùng 'new'
        IocCar car = context.getBean(IocCar.class);
        car.drive();
    }
}
