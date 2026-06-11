package training.oop_exercise;

import java.util.Scanner;

public class MainOOP {
    public static void main(String[] args) {
        
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- EMPLOYEE MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee Salary");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All");
            System.out.println("5. Exit");
            System.out.print("Please choose an option: ");
            
            String choice = scanner.nextLine().trim();
            
            switch (choice) {
                case "1":
                    String id = "";
                    while (true) {
                        System.out.print("Enter ID: ");
                        id = scanner.nextLine().trim();
                        if (id.isEmpty()) {
                            System.out.println("Error: ID cannot be empty!");
                        } else if (manager.isIdExist(id)) {
                            System.out.println("Error: ID already exists. Please enter a different ID!");
                        } else {
                            break;
                        }
                    }

                    String name = "";
                    while (true) {
                        System.out.print("Enter Name: ");
                        name = scanner.nextLine().trim();
                        if (name.isEmpty()) {
                            System.out.println("Error: Name cannot be empty!");
                        } else {
                            break;
                        }
                    }

                    int age = 0;
                    while (true) {
                        System.out.print("Enter Age (must be > 0): ");
                        try {
                            age = Integer.parseInt(scanner.nextLine().trim());
                            if (age <= 0) {
                                System.out.println("Error: Age must be greater than 0!");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number for Age!");
                        }
                    }

                    String address = "";
                    while (true) {
                        System.out.print("Enter Address: ");
                        address = scanner.nextLine().trim();
                        if (address.isEmpty()) {
                            System.out.println("Error: Address cannot be empty!");
                        } else {
                            break;
                        }
                    }

                    double salary = 0.0;
                    while (true) {
                        System.out.print("Enter Salary (must be >= 0): ");
                        try {
                            salary = Double.parseDouble(scanner.nextLine().trim());
                            if (salary < 0) {
                                System.out.println("Error: Salary cannot be negative!");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number for Salary!");
                        }
                    }
                    
                    Employee newEmp = new Employee(id, name, age, address, salary);
                    manager.add(newEmp);
                    break;
                    
                case "2":
                    System.out.print("Enter Employee ID to edit: ");
                    String editId = scanner.nextLine().trim();
                    if (!manager.isIdExist(editId)) {
                        System.out.println("Error: Employee ID not found!");
                        break;
                    }

                    double newSalary = 0.0;
                    while (true) {
                        System.out.print("Enter new Salary (must be >= 0): ");
                        try {
                            newSalary = Double.parseDouble(scanner.nextLine().trim());
                            if (newSalary < 0) {
                                System.out.println("Error: Salary cannot be negative!");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Error: Please enter a valid number for Salary!");
                        }
                    }

                    manager.edit(editId, newSalary);
                    break;
                    
                case "3":
                    System.out.print("Enter Employee ID to delete: ");
                    String deleteId = scanner.nextLine().trim();
                    if (deleteId.isEmpty()) {
                        System.out.println("Error: ID cannot be empty!");
                    } else {
                        manager.delete(deleteId);
                    }
                    break;
                    
                case "4":
                    manager.displayAll();
                    break;
                    
                case "5":
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option! Please enter a number between 1 and 5.");
            }
        }
    }
}
