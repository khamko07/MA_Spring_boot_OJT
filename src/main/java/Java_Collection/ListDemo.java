package Java_Collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        final int N = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long arrayAddTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        long linkedAddTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.get(i * 50);
        long arrayGetTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.get(i * 50);
        long linkedGetTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.remove(0);
        long arrayRemoveTime = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.remove(0);
        long linkedRemoveTime = System.nanoTime() - start;

        System.out.println("=== SO SANH ArrayList vs LinkedList (ns) ===");
        System.out.printf("ADD %d phan tu     | ArrayList: %-12d | LinkedList: %d%n",
                N, arrayAddTime, linkedAddTime);
        System.out.printf("GET 1000 lan       | ArrayList: %-12d | LinkedList: %d%n",
                arrayGetTime, linkedGetTime);
        System.out.printf("REMOVE dau 1000 lan| ArrayList: %-12d | LinkedList: %d%n",
                arrayRemoveTime, linkedRemoveTime);

        System.out.println("\nKet luan:");
        System.out.println("- ArrayList NHANH hon khi GET (truy cap ngau nhien)");
        System.out.println("- LinkedList NHANH hon khi REMOVE/ADD o dau danh sach");
    }
}
