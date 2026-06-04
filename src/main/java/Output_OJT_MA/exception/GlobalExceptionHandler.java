package Output_OJT_MA.exception;

import Output_OJT_MA.common.MessageRes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public ResponseEntity<MessageRes<String>> handleBusinessException(BusinessException ex) {
        return new ResponseEntity<>(new MessageRes<>(ex.getType(), ex.getMessage()), HttpStatus.ACCEPTED);
    }
}
