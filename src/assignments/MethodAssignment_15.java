package assignments;
/*Method without Return Value (void) and with Parameters (int, int[]):

     Assignment: Write a method to print each element of an int array multiplied by a given factor. 
 * 
 * 
 */
public class MethodAssignment_15 {
	
	public static void printArrayWithFactor(int factor, int[] array) {
		
		for(int num : array) {
			System.out.print((num*factor) + " ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		printArrayWithFactor(2,array);

	}

}
