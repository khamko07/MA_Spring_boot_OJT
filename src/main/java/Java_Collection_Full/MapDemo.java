package Java_Collection_Full;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Nguyen Van A");
        hashMap.put(2, "Tran Thi B");
        hashMap.put(1, "Nguyen Van A Updated");
        
        System.out.println("HashMap: " + hashMap);
        System.out.println("Get key 1: " + hashMap.get(1));
        
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Zebra", 100);
        treeMap.put("Apple", 50);
        treeMap.put("Mango", 70);
        
        System.out.println("TreeMap (sorted by key): " + treeMap);
    }
}
