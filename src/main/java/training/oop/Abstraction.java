package training.oop;
abstract class Vehicle {
    abstract void start();
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starting");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
