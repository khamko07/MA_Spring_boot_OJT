package OOP_V2;

abstract class Amimal90{
	abstract void sound();
}

class Dog90 extends Amimal90 {
	void sound() {
		System.out.println("Woof");
	}
}


public class Abstraction_BT1 {
	public static void main(String[] args) {
		Dog90 d = new Dog90();
		d.sound();
		
	}

}
