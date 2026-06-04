package Java_Advanced;

import java.util.ArrayList;

public class StreamDemo2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("John");
        names.add("David");
        names.add("Alex");
        names.add("Anna");
        names.add("Bob");
        names.add("Button");

        names.stream()
             .filter(name -> name.startsWith("B"))
             .forEach(System.out::println);
    }
}