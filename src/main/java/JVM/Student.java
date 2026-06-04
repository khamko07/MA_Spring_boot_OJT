package JVM;
public class Student {

    private String id;
    private String name;
    private int age;
    private double gpa;
    private Status status;

    public Student(String id, String name, int age, double gpa, Status status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.status = status;
    }

    public String getId()      { return id; }
    public String getName()    { return name; }
    public int    getAge()     { return age; }
    public double getGpa()     { return gpa; }
    public Status getStatus()  { return status; }

    @Override
    public String toString() {
        return String.format("%s | %-8s | age=%d | gpa=%.1f | %s",
                id, name, age, gpa, status);
    }
}
