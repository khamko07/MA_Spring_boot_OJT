package training.advanced;
enum Status {
    NEW, IN_PROGRESS, DONE
}
public class EnumExample {
    public static void main(String[] args) {
        Status s = Status.DONE;
        System.out.println(s);
    }
}
