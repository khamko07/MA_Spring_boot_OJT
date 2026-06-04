package Java_Collection_Exercise;

public class User {
    public String id;
    public String name;
    public int age;

    public User(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "-" + name + "-" + age;
    }
}
