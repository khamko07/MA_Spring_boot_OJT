package test;

public class Main {
    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Can not divide by zero");
        }
    }
}