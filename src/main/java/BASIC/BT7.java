package BASIC;

class Dog {
	 String name;
     String color;
	
	void brak(){
		System.out.println(" Lucky say woo");
		
	}
}

public class BT7 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Dog1";
		d.color = "Yello";
		System.out.println(d.name);
		System.err.println(d.color);
		d.brak();
		
	}

}
