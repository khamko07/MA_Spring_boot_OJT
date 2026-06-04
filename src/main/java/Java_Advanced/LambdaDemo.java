package Java_Advanced;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Running in lambda");
        r.run();
        
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(item -> System.out.println(item));
    }
}
