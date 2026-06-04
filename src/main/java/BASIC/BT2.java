package BASIC;

class Phone{
	String brand;
	String model;
	double price;
	void call () {
		System.out.println("iPhone is calling...");
	}
	
}



public class BT2 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
		p1.brand = "iPhone";
		p1.model = "15 Pro";
		p1.price = 1200;
		p1.call();
		
	}

}
