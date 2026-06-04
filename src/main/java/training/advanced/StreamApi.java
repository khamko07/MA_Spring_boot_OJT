package training.advanced;
import java.util.Arrays;
import java.util.List;
public class StreamApi {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
