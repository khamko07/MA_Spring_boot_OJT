package OOP_V2;
class Student2 {
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
public class Encapsulation_BT4 {
	public static void main(String[] args) {
		Student2 st2 = new Student2();
		st2.setName("Khamko");
		st2.setAge(22);
		
		System.out.println(st2.getName());
		System.out.println(st2.getAge());
	}

}
