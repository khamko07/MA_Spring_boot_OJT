package training.collection;
import java.util.Queue;
import java.util.LinkedList;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("First");
        System.out.println(q.poll());
    }
}
