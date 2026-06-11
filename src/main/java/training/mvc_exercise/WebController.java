package training.mvc_exercise;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // 🔴 LƯU Ý: Dùng @Controller chứ không phải @RestController
public class WebController {

    @GetMapping("/mvc-demo")
    public String showDemoPage(Model model) {
        // 👉 CHỮ M (MODEL): Đây là phần dữ liệu chúng ta chuẩn bị để gửi ra màn hình
        model.addAttribute("title", "Demo Spring Web MVC Siêu Dễ Hiểu");
        model.addAttribute("message", "Xin chào! Đây là dữ liệu được đẩy từ Controller ra ngoài giao diện HTML.");

        // 👉 CHỮ V (VIEW): Trả về tên của file HTML (không cần đuôi .html)
        // Spring Boot sẽ tự động đi tìm file tên là "demo.html" trong thư mục resources/templates
        return "demo"; 
    }
}
