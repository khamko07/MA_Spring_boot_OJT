package Demo_OOP;
//Viết chương trình quản lý phương tiện:
//
//Tạo class cha:
//Vehicle
//Có method:
//start()
//Tạo class con:
//Car
//Có method:
//run()
//Trong Main:
//tạo object Car
//gọi:
//start()
//run()


class Vehicle {
    void start() {
        System.out.println("Vehicle start");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car run");
    }
}

public class Inheritance1 {

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.run();
    }
}