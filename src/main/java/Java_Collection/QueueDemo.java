package Java_Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Khach 1");
        queue.offer("Khach 2");
        queue.offer("Khach 3");

        System.out.println("Hang doi hien tai: " + queue);
        System.out.println("Khach dau hang: " + queue.peek());

        System.out.println("\n--- Phuc vu lan luot ---");
        while (!queue.isEmpty()) {
            System.out.println("Phuc vu: " + queue.poll());
        }

        System.out.println("Hang doi con lai: " + queue);
    }
}
