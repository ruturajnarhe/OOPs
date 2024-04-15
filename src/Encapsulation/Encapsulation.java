package Encapsulation;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human();
//		obj.age = 11;
//		obj.name = "Ruturaj";
		obj.setAge(19);
		obj.setName("Ravindra");

		System.out.println(obj.getAge());
		System.out.println(obj.getName());
	}

}

class Human {
	private int age;
	private String name;
	
	public Human() { // Default Constructor
		int age;
		int name;
	}

	public Human(int age, String name) { // Parameterized Constructor
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

// private -> Only same class;
// default -> 