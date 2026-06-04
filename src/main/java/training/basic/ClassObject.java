package training.basic;
public class ClassObject {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.sayHi();
    }
}
class Person {
    String name;
    void sayHi() {
        System.out.println("Hi, I am " + name);
    }
}
