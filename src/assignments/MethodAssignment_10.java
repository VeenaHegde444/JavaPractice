package assignments;
/*Method with Return Value (int) and with Parameters (int, int):

Assignment: Write a method to add two integers and return the result.

Signature: public int add(int num1, int num2)
 * 
 * 
 * 
 */
public class MethodAssignment_10 {
	
	public int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static void main(String[] args) {
		MethodAssignment_10 obj = new MethodAssignment_10();
		System.out.println(obj.add(2, 5));

	}

}
