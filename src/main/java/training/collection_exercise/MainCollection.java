package training.collection_exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MainCollection {

    private static List<Student> studentList = new ArrayList<>();
    private static Map<String, Student> studentMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== COLLECTION MENU =====");
            System.out.println("1. Demo ArrayList vs LinkedList");
            System.out.println("2. Demo HashMap vs TreeMap");
            System.out.println("3. Demo HashSet");
            System.out.println("4. Demo Queue");
            System.out.println("5. Add Student");
            System.out.println("6. Edit Student");
            System.out.println("7. Delete Student");
            System.out.println("8. Display All Students");
            System.out.println("9. Find Student by ID");
            System.out.println("10. Explain Collections");
            System.out.println("0. Exit");
            System.out.print("Choose option: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    demoListSpeed();
                    break;
                case "2":
                    demoMaps();
                    break;
                case "3":
                    demoSet();
                    break;
                case "4":
                    demoQueue();
                    break;
                case "5":
                    addStudent(scanner);
                    break;
                case "6":
                    editStudent(scanner);
                    break;
                case "7":
                    deleteStudent(scanner);
                    break;
                case "8":
                    displayStudents();
                    break;
                case "9":
                    findStudent(scanner);
                    break;
                case "10":
                    explainCollections();
                    break;
                case "0":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void demoListSpeed() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        int size = 50000;

        long start = System.nanoTime();
        for (int i = 0; i < size; i++) arrayList.add(i);
        long arrayListAdd = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) linkedList.add(i);
        long linkedListAdd = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.get(size / 2);
        long arrayListGet = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.get(size / 2);
        long linkedListGet = System.nanoTime() - start;

        start = System.nanoTime();
        arrayList.remove(0);
        long arrayListRemove = System.nanoTime() - start;

        start = System.nanoTime();
        linkedList.remove(0);
        long linkedListRemove = System.nanoTime() - start;

        System.out.println("Action\t\tArrayList\tLinkedList");
        System.out.println("Add\t\t" + arrayListAdd + "\t\t" + linkedListAdd);
        System.out.println("Get(mid)\t" + arrayListGet + "\t\t" + linkedListGet);
        System.out.println("Remove(first)\t" + arrayListRemove + "\t" + linkedListRemove);
    }

    private static void demoMaps() {
        Map<String, User> hashMap = new HashMap<>();
        hashMap.put("U3", new User("C", 20));
        hashMap.put("U1", new User("A", 22));
        hashMap.put("U2", new User("B", 21));

        System.out.println("HashMap: " + hashMap);

        Map<String, User> treeMap = new TreeMap<>();
        treeMap.put("U3", new User("C", 20));
        treeMap.put("U1", new User("A", 22));
        treeMap.put("U2", new User("B", 21));

        System.out.println("TreeMap: " + treeMap);
    }

    private static void demoSet() {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println("HashSet: " + set + " Size: " + set.size());
    }

    private static void demoQueue() {
        Queue<String> queue = new LinkedList<>();
        queue.add("X");
        queue.add("Y");
        queue.add("Z");

        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine().trim();

        if (id.isEmpty()) {
            System.out.println("ID is required.");
            return;
        }

        if (studentMap.containsKey(id)) {
            System.out.println("ID already exists.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name is required.");
            return;
        }

        Student s = new Student(id, name);
        studentList.add(s);
        studentMap.put(id, s);
        System.out.println("Added successfully.");
    }

    private static void editStudent(Scanner scanner) {
        System.out.print("Enter ID to edit: ");
        String id = scanner.nextLine().trim();

        if (!studentMap.containsKey(id)) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new Name: ");
        String newName = scanner.nextLine().trim();

        if (newName.isEmpty()) {
            System.out.println("Name is required.");
            return;
        }

        Student s = studentMap.get(id);
        s.setName(newName);
        System.out.println("Edited successfully.");
    }

    private static void deleteStudent(Scanner scanner) {
        System.out.print("Enter ID to delete: ");
        String id = scanner.nextLine().trim();

        if (!studentMap.containsKey(id)) {
            System.out.println("Student not found.");
            return;
        }

        Student s = studentMap.get(id);
        studentList.remove(s);
        studentMap.remove(id);
        System.out.println("Deleted successfully.");
    }

    private static void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    private static void findStudent(Scanner scanner) {
        System.out.print("Enter ID to find: ");
        String id = scanner.nextLine().trim();

        Student s = studentMap.get(id);
        if (s != null) {
            System.out.println("Found: " + s);
        } else {
            System.out.println("Not found.");
        }
    }

    private static void explainCollections() {
        System.out.println("\n--- EXPLANATION ---");
        System.out.println("ArrayList vs LinkedList:");
        System.out.println("- Use ArrayList when you need fast random access (get).");
        System.out.println("- Use LinkedList when you need fast insertions/deletions at the beginning or middle.");
        System.out.println("\nHashMap vs TreeMap:");
        System.out.println("- Use HashMap when order does not matter and you want O(1) performance.");
        System.out.println("- Use TreeMap when you need keys sorted in natural order (O(log n) performance).");
    }
}
