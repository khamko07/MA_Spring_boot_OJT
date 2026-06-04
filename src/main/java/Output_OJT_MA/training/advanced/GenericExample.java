package Output_OJT_MA.training.advanced;
class Box<T> {
    T item;
    void set(T item) { this.item = item; }
    T get() { return item; }
}
public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hello");
        System.out.println(box.get());
    }
}
