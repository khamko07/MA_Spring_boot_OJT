package training.advanced;
interface MathOperation {
    int operate(int a, int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        System.out.println(add.operate(5, 5));
    }
}
