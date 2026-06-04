package Demo25;

class Animal1 {
    public void sound() {
        System.out.println("Animal sound");
    }
}

class Dog1 extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat1 extends Animal {
    public void sound() {
        System.out.println("meows");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Animal a1 = new Dog1();
        Animal a2 = new Cat1();

        a1.sound();
        a2.sound();
    }
}