package Java_Advanced;

enum OrderStatus {
    PENDING,
    SHIPPING,
    SUCCESS
}

public class EnumDemo2 {
    public static void main(String[] args) {

        OrderStatus status = OrderStatus.SHIPPING;

        switch(status) {

            case PENDING:
                System.out.println("Waiting order");
                break;

            case SHIPPING:
                System.out.println("Shipping...");
                break;

            case SUCCESS:
                System.out.println("Order success");
                break;
        }
    }
}
