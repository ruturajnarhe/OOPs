package Encapsulation;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human();
		Human obj1 = new Human(21, "Ajit");
		
		obj.setAge(19);
		obj.setName("Ravindra");
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());
		
	}

}


