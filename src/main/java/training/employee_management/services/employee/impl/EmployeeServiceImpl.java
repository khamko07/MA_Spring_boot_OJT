package training.employee_management.services.employee.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import training.employee_management.dtos.requests.EmployeeCreateRequest;
import training.employee_management.dtos.requests.EmployeeUpdateRequest;
import training.employee_management.dtos.responses.EmployeeResponse;
import training.employee_management.persistences.entities.Employee;
import training.employee_management.persistences.repositories.EmployeeRepository;
import training.employee_management.services.employee.IEmployeeService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeResponse> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(EmployeeResponse::new)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeResponse getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên với ID: " + id));
        return new EmployeeResponse(employee);
    }

    @Override
    @Transactional
    public EmployeeResponse createEmployee(EmployeeCreateRequest request) {
        if (employeeRepository.existsByEmail(request.getEmail())) {
            throw new IllegalArgumentException("Email đã tồn tại trong hệ thống");
        }

        Employee employee = new Employee(
                null,
                request.getName(),
                request.getEmail(),
                request.getAge(),
                request.getSalary(),
                request.getDepartment()
        );

        Employee savedEmployee = employeeRepository.save(employee);
        return new EmployeeResponse(savedEmployee);
    }

    @Override
    @Transactional
    public EmployeeResponse updateEmployee(Long id, EmployeeUpdateRequest request) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy nhân viên với ID: " + id));

        employee.setName(request.getName());
        employee.setAge(request.getAge());
        employee.setSalary(request.getSalary());
        employee.setDepartment(request.getDepartment());

        Employee updatedEmployee = employeeRepository.save(employee);
        return new EmployeeResponse(updatedEmployee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Long id) {
        if (!employeeRepository.existsById(id)) {
            throw new RuntimeException("Không tìm thấy nhân viên với ID: " + id);
        }
        employeeRepository.deleteById(id);
    }
}
