package JVM;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Cach cu - anonymous class");
            }
        };

        Runnable r2 = () -> System.out.println("Cach moi - lambda");

        r1.run();
        r2.run();

        List<Student> students = new ArrayList<>(List.of(
                new Student("SV01", "An",    20, 8.5, Status.ACTIVE),
                new Student("SV02", "Binh",  22, 6.5, Status.ACTIVE),
                new Student("SV03", "Cuong", 21, 9.2, Status.ACTIVE)
        ));

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student a, Student b) {
                return Double.compare(b.getGpa(), a.getGpa());
            }
        });
        System.out.println("\n--- Sort bang anonymous class (giam dan GPA) ---");
        students.forEach(System.out::println);

        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println("\n--- Sort bang lambda (theo ten A-Z) ---");
        students.forEach(System.out::println);

        students.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("\n--- Sort bang method reference (theo tuoi) ---");
        students.forEach(System.out::println);
    }
}
