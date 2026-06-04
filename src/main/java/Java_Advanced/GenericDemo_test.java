package Java_Advanced;

class Box<T> {
    T data;

    void setData(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}

public class GenericDemo_test {
    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setData("Hello Java");

        System.out.println(box.getData());
    }
}