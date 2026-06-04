package training.advanced;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Multithreading {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
