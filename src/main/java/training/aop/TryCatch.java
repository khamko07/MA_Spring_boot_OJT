package training.aop;
public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] arr = {1};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
    }
}
