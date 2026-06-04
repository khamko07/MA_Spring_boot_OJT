package Output_OJT_MA.training.oop;
class Parent {
    void show() {
        System.out.println("Parent show");
    }
}
class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child show");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
