package assignments;
//1.Write a program to print the addition/subtraction/division/multiplication of two numbers by defining your own method
public class MethodAssignment_01 {
	
	// Addition
	
	public static int addition(int a, int b) {
		int sum = a + b;
		return sum;		
	}
	
	// Subtraction
	
	public static int subtraction(int a, int b) {
		int sub = a - b;
		return sub;		
	}
	
	//Multiplication
	
	public static int multiplication(int a, int b) {
		int multiply = a * b;
		return multiply;		
	}
	
	//Division
	
	public static int division(int a, int b) {
		int div = a / b;
		return div;		
	}

	public static void main(String[] args) {
		
		System.out.println("Addition of two numbers :"+addition(2,2));
		System.out.println("Subtraction of two numbers :"+subtraction(5,3));
		System.out.println("Multiplication of two numbers: "+multiplication(1,5));
		System.out.println("Division of two numbers: "+division(10,5));

	}

}
