package OOP_V2;

class Animal2{
	void eat() {
		System.out.println(" Animal is eating");
	}
}

class Dog4 extends Animal2{
	void bark() {
		System.out.println("Woof Woof");
	}
}

public class Inheritance_BT2 {
	public static void main(String[] args) {
		Dog4 d = new Dog4 ();
		d.eat();
		d.bark();
	}

}
