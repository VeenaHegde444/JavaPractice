package arrayPrograms;

import java.util.Arrays;

/*
 * There are two array objects of int type. One is containing 100 elements and another one is containing 10 elements.
 *  Can you assign an array of 100 elements to an array of 10 elements?
 * 
 */

public class Program_3 {

	public static void main(String[] args) {
		int[] a = new int[100];
		int[] b = new int[10];
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println(Arrays.equals(a, b));
		
		a=b;//compiler checks only type, not size
		
		System.out.println(a.length);
		System.out.println(b.length);
		
		System.out.println(Arrays.equals(a, b));
		

	}

}


//Ans: Yes, you can assign an array of 100 elements to an array of 10 elements provided they should be of same type. 
//While assigning, compiler checks only the type of an array not the size.