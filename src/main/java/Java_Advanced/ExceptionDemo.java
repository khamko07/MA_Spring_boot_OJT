package Java_Advanced;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error can not / zero");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
