package Demo_OOP;


//Viết chương trình thanh toán online:
//
//Tạo abstract class:
//Payment
//Có abstract method:
//pay()
//Tạo class con:
//CreditCard
//QRPayment
//Override:
//pay()

class Payment {
    void pay(String x) {
    	x = "A";
        System.out.println(x);
    }
}



public class Abstraction1 {
    public static void main(String[] args) {
//    	int x = 10;
    	String x = new String("Test");
    	
    	System.out.println(x);
    	Payment p = new Payment();
    	p.pay(x);
    	System.out.println(x);
    	
    }
}