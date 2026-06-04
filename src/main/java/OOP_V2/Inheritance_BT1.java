package OOP_V2;

class Animal {
	void eat() {
		System.out.println("THis is methode class dog");
	}
	void sleep () {
		System.out.println("This is method class slepp");
	}
}

class Dog extends Animal{
	void brak() {
		System.out.println("wrooff");
	}
}

public class Inheritance_BT1 {
	public static void main(String[] args) {
		Dog a = new Dog();
		a.eat();
		a.sleep();
		a.brak();
		
		
	}

}
