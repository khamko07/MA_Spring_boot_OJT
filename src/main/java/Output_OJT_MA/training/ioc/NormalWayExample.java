package Output_OJT_MA.training.ioc;

class Engine {
    public void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private Engine engine;
    public Car() {
        // Tự tạo object bằng từ khóa 'new' (Cách bình thường)
        this.engine = new Engine();
    }
    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

public class NormalWayExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
