package Java_Collection_Exercise;

public class Student {
    public String id;
    public String name;
    public double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + gpa;
    }
}
