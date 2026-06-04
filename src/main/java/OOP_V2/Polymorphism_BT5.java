package OOP_V2;

class Vehicle {
	void move() {
		System.out.println("Vehicle is moving");
	}
}


class Car99 extends Vehicle{
	void move() {
		System.out.println("Car is running");
	}
}

class Motorcycle extends Vehicle {
	void move() {
		System.out.println(" Motorcycle is racing");
	}
}

public class Polymorphism_BT5 {
	public static void main(String[] args) {
		Car99 c = new Car99();
		c.move();
		
		Motorcycle m = new Motorcycle();
		m.move();
	}

}
