package Spring_DI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DiRunner implements CommandLineRunner {

    private final Client_FieldInjection fieldClient;
    private final Client_SetterInjection setterClient;
    private final Client_ConstructorInjection constructorClient;

    public DiRunner(Client_FieldInjection fieldClient, 
                    Client_SetterInjection setterClient, 
                    Client_ConstructorInjection constructorClient) {
        this.fieldClient = fieldClient;
        this.setterClient = setterClient;
        this.constructorClient = constructorClient;
    }

    @Override
    public void run(String... args) {
        System.out.println("\n\n================= BAT DAU DEMO SPRING DI (Dependency Injection) =================");
        
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║  PHẦN 1: So sánh 3 cách Injection (Tiêm Dependency)     ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println("""
                
                1. Field Injection (@Autowired trực tiếp trên biến):
                  → Ngắn gọn nhất, nhưng bị CẤM/Không khuyến khích bởi Spring.
                  → Khó viết Unit Test (cần Reflection), có thể xảy ra NullPointerException do vi phạm nguyên tắc đóng gói (Encapsulation).
                
                2. Setter Injection (Tiêm qua hàm setter):
                  → Dùng cho các dependency tùy chọn (Optional).
                  → Có thể thay đổi dependency trong lúc ứng dụng đang chạy (runtime).
                
                3. Constructor Injection (Tiêm qua constructor):
                  → ĐƯỢC KHUYÊN DÙNG NHẤT (Best Practice).
                  → Bắt buộc truyền dependency khi khởi tạo Object -> An toàn tuyệt đối, không sợ Null.
                  → Cho phép khai báo biến là 'final' (Bất biến).
                  → Cực kỳ dễ viết Unit Test bằng cách new Object() và truyền Mock vào.
                  → Chú ý: Từ Spring 4.3, nếu class chỉ có 1 Constructor, KHÔNG CẦN viết @Autowired.
                """);
                
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║  PHẦN 2: @Qualifier (Giải quyết xung đột nhiều Bean)    ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
        System.out.println("""
                
                @Qualifier được sử dụng khi có TỪ 2 CLASS TRỞ LÊN cùng implement 1 interface.
                Ví dụ: Interface MessageService có 2 class con là EmailService và SmsService.
                Nếu chỉ viết @Autowired MessageService, Spring sẽ báo lỗi (NoUniqueBeanDefinitionException).
                Giải pháp:
                  → Dùng @Qualifier("tên_bean") để chỉ định chính xác Bean nào sẽ được tiêm.
                """);

        System.out.println("\n--- THỰC THI DEMO CÁC CLIENT ---");
        fieldClient.processMessage("Khuyen mai 50%", "user_A_email");
        setterClient.processMessage("Ma xac nhan 123456", "0901234567");
        constructorClient.processMessage("Don hang da giao thanh cong", "user_B_email");
        
        System.out.println("================= KET THUC DEMO SPRING DI =================\n\n");
    }
}
