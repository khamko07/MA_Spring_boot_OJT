package Java_Collection_Full;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Get index 1: " + arrayList.get(1));
        
        arrayList.remove("Python");
        System.out.println("After remove: " + arrayList);
        
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Spring");
        linkedList.add("Hibernate");
        System.out.println("LinkedList: " + linkedList);
    }
}
