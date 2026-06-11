package training.oop_exercise;

public class Employee extends Person {

    private double salary;

    public Employee() {
        super();
    }

    public Employee(String id, String name, int age, String address, double salary) {
        super(id, name, age, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee Info - ID: " + getId() + ", Name: " + name + ", Age: " + age + ", Salary: $" + salary);
    }
}
