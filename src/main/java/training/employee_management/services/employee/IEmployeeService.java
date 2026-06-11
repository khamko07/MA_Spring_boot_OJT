package training.employee_management.services.employee;

import training.employee_management.dtos.requests.EmployeeCreateRequest;
import training.employee_management.dtos.requests.EmployeeUpdateRequest;
import training.employee_management.dtos.responses.EmployeeResponse;

import java.util.List;

public interface IEmployeeService {
    List<EmployeeResponse> getAllEmployees();
    EmployeeResponse getEmployeeById(Long id);
    EmployeeResponse createEmployee(EmployeeCreateRequest request);
    EmployeeResponse updateEmployee(Long id, EmployeeUpdateRequest request);
    void deleteEmployee(Long id);
}
