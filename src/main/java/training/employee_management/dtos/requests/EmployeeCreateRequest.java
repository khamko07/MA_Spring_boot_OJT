package training.employee_management.dtos.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import training.employee_management.commons.enums.Department;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeCreateRequest {

    @NotBlank(message = "Tên nhân viên không được để trống")
    private String name;

    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @NotNull(message = "Tuổi không được để trống")
    @Min(value = 18, message = "Tuổi nhân viên phải từ 18 trở lên")
    private Integer age;

    @NotNull(message = "Lương không được để trống")
    @Min(value = 0, message = "Lương không được là số âm")
    private Double salary;

    @NotNull(message = "Phòng ban không được để trống")
    private Department department;
}
