package Java_Collection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManager {

    private List<Student> studentList = new ArrayList<>();
    private Map<String, Student> studentMap = new HashMap<>();

    public void add(Student s) {
        if (studentMap.containsKey(s.getId())) {
            System.out.println("Da ton tai id: " + s.getId());
            return;
        }
        studentList.add(s);
        studentMap.put(s.getId(), s);
    }

    public Student findById(String id) {
        return studentMap.get(id);
    }

    public void update(String id, String newName, int newAge) {
        Student s = studentMap.get(id);
        if (s == null) {
            System.out.println("Khong tim thay id: " + id);
            return;
        }
        s.setName(newName);
        s.setAge(newAge);
    }

    public void delete(String id) {
        Student s = studentMap.remove(id);
        if (s != null) {
            studentList.remove(s);
        }
    }

    public void displayAll() {
        System.out.println("--- Danh sach sinh vien ---");
        for (Student s : studentList) {
            System.out.println(s);
        }
    }
}
