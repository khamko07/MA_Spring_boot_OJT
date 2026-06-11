package training.employee_management.dtos.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import training.employee_management.commons.enums.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeUpdateRequest {

    @NotBlank(message = "Tên nhân viên không được để trống")
    private String name;

    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18, message = "Tuổi nhân viên phải từ 18 trở lên")
    private Integer age;

    @NotNull(message = "Lương không được để trống")
    @Min(value = 0, message = "Lương không được là số âm")
    private Double salary;

    @NotNull(message = "Phòng ban không được để trống")
    private Department department;
}
