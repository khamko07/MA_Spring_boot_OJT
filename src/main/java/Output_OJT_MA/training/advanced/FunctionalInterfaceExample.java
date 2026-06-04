package Output_OJT_MA.training.advanced;
@FunctionalInterface
interface Greeting {
    void sayMessage(String message);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Greeting g = msg -> System.out.println(msg);
        g.sayMessage("Hello");
    }
}
