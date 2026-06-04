package Output_OJT_MA.training.basic;
public class ConstructorExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        System.out.println(car.model);
    }
}
class Car {
    String model;
    public Car(String model) {
        this.model = model;
    }
}
