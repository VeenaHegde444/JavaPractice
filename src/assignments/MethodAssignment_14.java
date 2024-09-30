package assignments;

import java.util.Arrays;

/*Method with Return Value (Object[]) and with Parameters (Object[]):

Assignment: Write a method to reverse the order of elements in an Object array and return the reversed array. 

Signature: public Object[] reverseArray(Object[] array)
 * 
 */
public class MethodAssignment_14 {
	
	
	public static Object[] reverseArray(Object[] array) {
		int length = array.length;
		Object[] reversedArray = new Object[length];
		//reverse the order of elements
		int count = 0;
		for(int i=length-1;i>=0;i--) {
			reversedArray[count]=array[i];
			count++;
		}
		return reversedArray;
	}

	public static void main(String[] args) {
		Object[] originalArray = {1,2,3,4,5};
		Object[] reversedArray=reverseArray(originalArray);
		System.out.println(Arrays.toString(reversedArray));

	}

}
