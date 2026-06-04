package BASIC;

class Car {
    String brand;
    String color;

    void run() {
        System.out.println("This is method run for car");
    }
}

class Cat {
    String name;
    int age;

    void meow() {
        System.out.println("This is meow method");
    }
}

class Book {
    String title;
    double price;

    void showInfo() {
        System.out.println("This is info book");
    }
}

public class BT1 {

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "Khamko";
        c.color = "Red";

        System.out.println(c.brand);
        System.out.println(c.color);

        c.run();

        System.out.println("=====");

        Cat c2 = new Cat();

        c2.name = "Meo1";
        c2.age = 2;

        System.out.println(c2.name);
        System.out.println(c2.age);

        c2.meow();

        System.out.println("=====");

        Book b = new Book();

        b.title = "Test book1";
        b.price = 3000;

        System.out.println(b.title);
        System.out.println(b.price);

        b.showInfo();
    }
}