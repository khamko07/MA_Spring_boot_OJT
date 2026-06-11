package training.oop_exercise;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements EmployeeActions {
    
    private List<Employee> employeeList;

    public EmployeeManager() {
        this.employeeList = new ArrayList<>();
    }

    public boolean isIdExist(String id) {
        return employeeList.stream().anyMatch(emp -> emp.getId().equals(id));
    }

    @Override
    public void add(Employee emp) {
        employeeList.add(emp);
        System.out.println("Add success: " + emp.getName());
    }

    @Override
    public void edit(String id, double newSalary) {
        for (Employee emp : employeeList) {
            if (emp.getId().equals(id)) {
                emp.setSalary(newSalary);
                System.out.println("Edit success: " + emp.getName() + " (New Salary: $" + newSalary + ")");
                return;
            }
        }
        System.out.println("Not found ID: " + id);
    }

    @Override
    public void delete(String id) {
        boolean removed = employeeList.removeIf(emp -> emp.getId().equals(id));
        if (removed) {
            System.out.println("Delete success ID: " + id);
        } else {
            System.out.println("Not found ID: " + id);
        }
    }

    @Override
    public void displayAll() {
        System.out.println("--- Employee List ---");
        if (employeeList.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            for (Employee emp : employeeList) {
                emp.showInfo();
            }
        }
        System.out.println("---------------------");
    }
}
