package Java_Collection_Exercise;

import java.util.*;

public class Exercise1_CollectionDemos {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        List<Integer> lnkList = new LinkedList<>();
        
        for (int i = 0; i < 1000; i++) {
            arrList.add(i);
            lnkList.add(i);
        }
        
        System.out.println("ArrayList get: " + arrList.get(500));
        System.out.println("LinkedList get: " + lnkList.get(500));
        
        Map<String, User> map = new HashMap<>();
        map.put("U1", new User("U1", "A", 20));
        System.out.println(map.get("U1"));
        
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        System.out.println(set);
        
        Queue<String> q = new LinkedList<>();
        q.add("1");
        System.out.println(q.poll());
    }
}
