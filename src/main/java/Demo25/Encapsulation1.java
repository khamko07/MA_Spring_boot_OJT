package Demo25;


class Student {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}


public class Encapsulation1 {
	public static void main(String[] args) {
		Student n = new Student();
		n.setName("Khamko");
		n.setAge(25);
		
		System.out.println(n.getName());
		System.out.println(n.getAge());
	}

}
