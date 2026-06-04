package Java_Collection_Exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise2_StudentManager {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Map<String, Student> map = new HashMap<>();
        
        Student s1 = new Student("1", "An", 8.0);
        list.add(s1);
        map.put(s1.id, s1);
        
        System.out.println(list);
        System.out.println(map.get("1"));
        
        map.remove("1");
        list.remove(s1);
    }
}
