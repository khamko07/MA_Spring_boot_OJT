package training.collection;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("VN", "Vietnam");
        System.out.println(map.get("VN"));
    }
}
