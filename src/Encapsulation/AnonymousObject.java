package Encapsulation;

public class AnonymousObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new A().show(); // anonymous object
		new A().show();
	}

}

class A {
	public A() {
		System.out.println("object created");
	}
	
	public void show() {
		System.out.println("in A show");
	}
}
