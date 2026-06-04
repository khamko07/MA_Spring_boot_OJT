package Java_Collection;
public class StudentMain {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        manager.add(new Student("SV01", "An", 20));
        manager.add(new Student("SV02", "Binh", 21));
        manager.add(new Student("SV03", "Cuong", 22));

        manager.displayAll();

        System.out.println("\nTim SV02: " + manager.findById("SV02"));

        System.out.println("\nSua SV02...");
        manager.update("SV02", "Binh Updated", 25);
        System.out.println("Sau khi sua: " + manager.findById("SV02"));

        System.out.println("\nXoa SV01...");
        manager.delete("SV01");
        manager.displayAll();
    }
}
