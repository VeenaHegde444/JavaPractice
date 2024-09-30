package javaBasicsPractice;

public class MethodOverloading_Practice {
//10/06/2024	
	/*Method overloading: compile-time polymorphism, static polymorphism, early binding
	 * 
	 * Switch case: no need to write 'break' statement if we are writing 'return'
	 * 
	 * Method overloading: within the same class if we have multiple method with
	 * i) same method name
	 * ii)with different no. of input parameters
	 * iii)with different sequence of parameters
	 * iv)return type doesn't matter
	 * 
	 * Poly-many
	 * morphism-forms
	 * Polymorphism means many forms.
	 * 
	 * Advantages of Polymorphism:
	 * i)Easy code maintenance
	 * ii)Improves readability
	 * iii) enhances reusability
	 * 
	 * We can overload main() method in java
	 * 
	 * What if the exact prototype doesn't match with arguments?
	 * Priority-wise compiler takes below steps:
	 * i)Type conversion but to a higher type in the same family
	 * ii) Type conversion to the next higher family(suppose if there is no long data type available for an int data type, then it will
	 * search for the float data type
	 * Byte->Short->Character->Integer->Long->Float->Double->Object
	 */
	
	
	
	
	public int sum(int a) {//1 input parameter
		int sum = a+0;
		return sum;
	}

	public int sum(int a, int b) {//2 input parameters
		int sum = a+b;
		return sum;
	}
	
	public int sum(int a, int b, int c) {//3 input parameters
		int sum = a+b+c;
		return sum;
	}
	
	public double sum(double a, double b) {//2 input parameters but different type
		double sum = a+b;
		return sum;
	}
	
	
	public float sum(float a) {//1 input parameter but different type
		float sum = a;
		return sum;
	}
	
	//What if the exact prototype does not match with arguments?
	/* Priority-wise, the compiler takes these steps:

Type Conversion but to a higher type(in terms of range) in the same family.
Type conversion to the next higher family(suppose if there is no long data type available for an int data type, then it will search for 
the float data type).
	 * 
	 */
	
/*	public void show(int x) {
		System.out.println("In int "+ x);
	}
*/	
	public void show(String s) {
		System.out.println("In String "+ s);
	}
	
	public void show(byte b) {
		System.out.println("In byte "+ b);
	}
	
	public void show(char c) {
		System.out.println("In character "+ c);
	}

	public static void main(String[] args) {
		
		MethodOverloading_Practice obj = new MethodOverloading_Practice();
        System.out.println(obj.sum(10));
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10, 20, 30));
        System.out.println(obj.sum(15.5, 5.5));
        System.out.println(obj.sum(0.5f));
        
        //if we have to print byte then we need to do type casting since byte is smaller in size
        obj.show((byte)5);
       // obj.show(100);
        obj.show("Veena");
        obj.show('a');
        


	}

}
