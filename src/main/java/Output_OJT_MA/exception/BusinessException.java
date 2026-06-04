package Output_OJT_MA.exception;

public class BusinessException extends RuntimeException {
    private final String type;

    public BusinessException(String type, String message) {
        super(message);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
