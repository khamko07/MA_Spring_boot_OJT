package Output_OJT_MA.training.basic;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
