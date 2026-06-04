package BASIC;

class Employee {
	String name;
	double salary;
	String position;
	void work() {
		System.out.println("Employee is working");
	}
}

public class BT4 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Alex";
		e.salary = 2000;
		e.position = "Developer";
		
		System.out.println(e.name);
		System.out.println(e.salary);
		System.out.println(e.position);
		e.work();
		
	}

}
