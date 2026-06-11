package Output_OJT_MA.exception;

import Output_OJT_MA.common.MessageRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.validation.FieldError;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public ResponseEntity<MessageRes<String>> handleBusinessException(BusinessException ex) {
        return new ResponseEntity<>(new MessageRes<>(ex.getType(), ex.getMessage(), null), HttpStatus.ACCEPTED);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public ResponseEntity<MessageRes<Map<String, String>>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });
        return new ResponseEntity<>(new MessageRes<>("VALIDATION_ERROR", "Dữ liệu không hợp lệ", errors), HttpStatus.BAD_REQUEST);
    }
}
