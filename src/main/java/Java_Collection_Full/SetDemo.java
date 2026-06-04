package Java_Collection_Full;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Apple"); 
        hashSet.add("Orange");
        
        System.out.println("HashSet (no duplicates): " + hashSet);
        
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(10);
        treeSet.add(3);
        
        System.out.println("TreeSet (sorted): " + treeSet);
    }
}
