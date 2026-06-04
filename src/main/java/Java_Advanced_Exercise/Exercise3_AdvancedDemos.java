package Java_Advanced_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3_AdvancedDemos {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.value = "test";
        System.out.println(box.value);
        
        Status s = Status.ACTIVE;
        System.out.println(s);
        
        Runnable r = () -> System.out.println("lambda run");
        r.run();
        
        List<Student> students = Arrays.asList(
            new Student("A", 8, Status.ACTIVE),
            new Student("B", 5, Status.INACTIVE)
        );
        
        List<Student> active = students.stream()
            .filter(st -> st.status == Status.ACTIVE)
            .collect(Collectors.toList());
            
        System.out.println(active.size());
    }
}
