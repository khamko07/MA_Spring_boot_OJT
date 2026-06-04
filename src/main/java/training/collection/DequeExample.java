package training.collection;
import java.util.Deque;
import java.util.ArrayDeque;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();
        d.addFirst("Front");
        d.addLast("Back");
        System.out.println(d);
    }
}
