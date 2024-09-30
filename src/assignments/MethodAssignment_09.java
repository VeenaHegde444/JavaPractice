package assignments;
/*Methods without Return Value (void) and without Parameters:

Assignment: Write a method to print "Hello, World!" to the console without taking any input.

Signature: public void printHello()
 * 
 * 
 * 
 */
public class MethodAssignment_09 {
	
	public void printHello() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		
		//create object to access non-static methods
		MethodAssignment_09 obj = new MethodAssignment_09();
		obj.printHello();
	}

}
