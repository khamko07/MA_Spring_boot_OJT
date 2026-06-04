package JVM;
import java.util.List;

public class Box<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static <E> void printList(List<E> list) {
        for (E item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Hello");
        System.out.println("Box<String>: " + box1.get());

        Box<Integer> box2 = new Box<>();
        box2.set(123);
        System.out.println("Box<Integer>: " + box2.get());

        String s = box1.get();
        int n = box2.get();
        System.out.println("Lay ra: " + s + ", " + n);

        System.out.println("\n--- printList voi List<String> ---");
        printList(List.of("A", "B", "C"));

        System.out.println("--- printList voi List<Integer> ---");
        printList(List.of(1, 2, 3));
    }
}
