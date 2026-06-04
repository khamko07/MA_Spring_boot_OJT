package OOP_V2;

abstract class Animal20{
	abstract void sound();
}

class Dog100 extends Animal20{
	void sound() {
		System.out.println("Sound Dog");
	}
	
}

class Cat100 extends Animal20 {
	void sound() {
		System.out.println("Sound cat");
	}
}

public class Abstraction_BT3 {
	public static void main(String[] args) {
		Dog100 d = new Dog100();
		Cat100 c = new Cat100();
		
		d.sound();
		c.sound();
	}

}
