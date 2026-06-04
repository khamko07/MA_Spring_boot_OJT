package training.validation;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo-validation")
public class SimpleValidationController {

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody UserForm form) {
        return ResponseEntity.ok("Success! Tên: " + form.getName() + ", Email: " + form.getEmail());
    }
}
