package Demo25;

abstract class Animal2 {
    abstract void sound();
}

class Dog2 extends Animal2 {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat2 extends Animal2 {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Abstraction1 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Cat2 cat = new Cat2();

        dog.sound();
        cat.sound();
    }
}