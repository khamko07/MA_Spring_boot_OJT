package JVM;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("SV01", "An",    20, 8.5, Status.ACTIVE),
                new Student("SV02", "Binh",  22, 6.5, Status.ACTIVE),
                new Student("SV03", "Cuong", 21, 9.2, Status.INACTIVE),
                new Student("SV04", "Dung",  23, 7.8, Status.ACTIVE),
                new Student("SV05", "Em",    19, 5.5, Status.DELETED)
        );

        System.out.println("=== FILTER: ACTIVE va GPA >= 7 ===");
        List<Student> goodActive = students.stream()
                .filter(s -> s.getStatus() == Status.ACTIVE)
                .filter(s -> s.getGpa() >= 7.0)
                .collect(Collectors.toList());
        goodActive.forEach(System.out::println);

        System.out.println("\n=== MAP: lay ra danh sach ten ===");
        List<String> names = students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(names);

        System.out.println("\n=== REDUCE: tong GPA ===");
        double totalGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .sum();
        System.out.println("Tong GPA = " + totalGpa);

        double avgGpa = students.stream()
                .mapToDouble(Student::getGpa)
                .average()
                .orElse(0);
        System.out.printf("GPA trung binh = %.2f%n", avgGpa);

        System.out.println("\n=== COUNT: so sinh vien ACTIVE ===");
        long activeCount = students.stream()
                .filter(s -> s.getStatus() == Status.ACTIVE)
                .count();
        System.out.println("So sinh vien ACTIVE = " + activeCount);
    }
}
