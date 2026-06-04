package training.aop;
public class ThrowsExample {
    static void check() throws Exception {
        throw new Exception("Error occurred");
    }
    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
