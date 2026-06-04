package Output_OJT_MA.training.oop;
abstract class Computer {
    abstract void turnOn();
    void turnOff() {
        System.out.println("Turning off");
    }
}
class Laptop extends Computer {
    void turnOn() {
        System.out.println("Laptop turning on");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Computer c = new Laptop();
        c.turnOn();
        c.turnOff();
    }
}
