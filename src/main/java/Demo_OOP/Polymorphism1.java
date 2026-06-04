package Demo_OOP;

//Viết chương trình động vật:
//
//Tạo class cha:
//Animal
//Có method:
//sound()
//Tạo class con:
//Dog
//Cat
//Override method:
//sound()
//Output:
//Dog → Woof




class Animal {
    void sound() {
       System.out.println("Animal soud");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.sound();
        c.sound();
    }
}