package OOP_ver3;

class Animal{
	public void sound() {
		System.out.println("This is void brak");
	}
}

class Dog extends Animal{
	public void brak() {
		System.out.println("Dog brak");
	}
}

public class Inheritance2 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.brak();
		
	}

}
