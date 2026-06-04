package Java_Collection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "An", "Binh", "An", "Cuong", "Binh", "Dung"
        );

        System.out.println("Danh sach goc: " + names);

        Set<String> uniqueNames = new HashSet<>(names);

        System.out.println("Sau khi loai trung: " + uniqueNames);
        System.out.println("So phan tu duy nhat: " + uniqueNames.size());

        System.out.println("\nCo 'An' khong? " + uniqueNames.contains("An"));
        uniqueNames.add("Em");
        uniqueNames.add("An");
        System.out.println("Sau khi them: " + uniqueNames);
    }
}
