package Demo25;

class Animal {
    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog bark");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sound();
        dog.bark();  
    }
}