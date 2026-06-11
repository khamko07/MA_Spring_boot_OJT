package training.employee_management.commons.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Department {
    IT("Cong nghe thong tin", 0),
    HR("Nhan su", 1),
    SALES("Kinh doanh", 2);
//	fix lai enum

    private final String displayName;
    private final int code;
}
