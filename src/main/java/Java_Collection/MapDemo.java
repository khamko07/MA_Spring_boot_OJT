package Java_Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("U003", "An, 20");
        hashMap.put("U001", "Binh, 22");
        hashMap.put("U002", "Cuong, 25");
        hashMap.put("U005", "Dung, 19");

        System.out.println("=== HashMap (khong dam bao thu tu) ===");
        for (Map.Entry<String, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        Map<String, String> treeMap = new TreeMap<>(hashMap);

        System.out.println("\n=== TreeMap (tu sap xep theo key) ===");
        for (Map.Entry<String, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\n=== Cac thao tac voi Map ===");
        System.out.println("Lay user U002: " + hashMap.get("U002"));
        System.out.println("Co U010 khong? " + hashMap.containsKey("U010"));

        hashMap.remove("U001");
        System.out.println("Sau khi xoa U001, size = " + hashMap.size());
    }
}
