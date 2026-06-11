package training.oop_exercise;

public interface EmployeeActions {
    void add(Employee emp);
    void edit(String id, double newSalary);
    void delete(String id);
    void displayAll();
}
