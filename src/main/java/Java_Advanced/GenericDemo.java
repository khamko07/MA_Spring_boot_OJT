package Java_Advanced;

import java.util.ArrayList;

class DataBox<T> {
    private T data;
    
    public void setData(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        DataBox<String> stringBox = new DataBox<>();
        stringBox.setData("Hello");
        System.out.println(stringBox.getData());
        
        DataBox<Integer> intBox = new DataBox<>();
        intBox.setData(100);
        System.out.println(intBox.getData());
    }
}
