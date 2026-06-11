package training.employee_management.dtos.responses;

import training.employee_management.commons.enums.Department;
import training.employee_management.persistences.entities.Employee;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeResponse {

    private Long id;
    private String name;
    private String email;
    private Integer age;
    private Double salary;
    private Department department;

    public EmployeeResponse() {}

    public EmployeeResponse(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.age = employee.getAge();
        this.salary = employee.getSalary();
        this.department = employee.getDepartment();
    }
}
