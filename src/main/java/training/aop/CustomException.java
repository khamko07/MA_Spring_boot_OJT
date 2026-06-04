package training.aop;
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("My error");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
