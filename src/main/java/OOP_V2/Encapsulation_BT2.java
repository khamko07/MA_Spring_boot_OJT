package OOP_V2;

class Employee {
	private String name;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}

}

public class Encapsulation_BT2 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setName("Khamko");
		e.setSalary(2000);
		
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}

}
