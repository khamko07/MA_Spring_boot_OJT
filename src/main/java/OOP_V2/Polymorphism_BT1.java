package OOP_V2;

class Animal9 {
	void sound() {
		System.out.println("Sound animal");
	}
}
class Dog10 extends Animal9 {
	void sound() {
		System.out.println("woof");
	}
}

class Cat10 extends Animal9 {
	void sound() {
		System.out.println("Meow");
	}
}


public class Polymorphism_BT1 {
	public static void main(String[] args) {
		Dog10 d = new Dog10();
		d.sound();
		
		Cat10 c = new Cat10();
		c.sound();
	}

}

