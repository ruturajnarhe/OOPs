package Encapsulation;

public class ObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 4; 
		int num2 = 5;
		
		Calculator calc = new Calculator();
		
		int result = calc.add(num1, num2);

//		int result = num1 + num2;
//
		System.out.println(result);
	}

}

class Calculator {
	int a;
	public int add(int n1, int n2) {
		int r = n1 + n2;
		return r;
	}
}

// Object Oriented Programming
// Object -> Properties and Behaviours

// Class 