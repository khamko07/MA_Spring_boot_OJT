package OOP_V2;

abstract class Vehicle10 {
	abstract void start();
	
}

class car22 extends Vehicle10 {
	void start() {
		System.out.println("Car is starting");
	}
}
class Motorcycle22 extends Vehicle10 {
	void start () {
		System.out.println("Motorcycle is starting");
	}
}


public class Abstraction_BT4 {
	public static void main(String[] args) {
		car22 c = new car22();
		Motorcycle22 m = new Motorcycle22();
		
		c.start();
		m.start();
	}

}
