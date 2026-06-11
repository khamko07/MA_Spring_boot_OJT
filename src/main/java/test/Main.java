package test;

interface Hello {
    void say();
}

public class Main {

    public static void main(String[] args) {

        Hello h = () -> System.out.println("Hello");

        h.say();
    }
}