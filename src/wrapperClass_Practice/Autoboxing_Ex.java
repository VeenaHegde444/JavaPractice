package wrapperClass_Practice;

import java.util.ArrayList;
import java.util.List;

/*Autoboxing is a procedure of converting a primitive value into an object of the corresponding wrapper class.
 * Autoboxing is a automatic conversion, it converts primitive types to object of their corresponding wrapper class
 */
public class Autoboxing_Ex {

	public static void main(String[] args) {
		int x = 5;
		float y = 3.14f;
		long z = 6000;
		
		//autoboxing
		
		Integer intToObj = x;
		Float floatToObj = y;
		Long longToObj = z;
		
		System.out.println(intToObj);
		System.out.println(floatToObj);
		System.out.println(floatToObj);

		Integer num1 = new Integer(10); //deprecated
		
		Integer num2 = Integer.valueOf(10);
		System.out.println(num2);
		
		//Autoboxing: java compiler in the background would perform the valueOf() operation & create the instance of it
		
		//create instances using AutoBoxing:
		
		Integer num3 = 5;
		Integer num4 = 5;
		
		boolean boo = (num3 == num4);
		System.out.println(boo); //true, both num3 & num4 are pointing to the same memory location in the heap
		
		
		//toString(char ch): it returns a String class object representing the specified character value
		
		System.out.println(Character.toString('a'));
		System.out.println(Character.hashCode('a'));//97
		System.out.println(Character.hashCode('A'));//65
		System.out.println(Character.hashCode('0'));//48
		
		
		// escape sequence:
		/* \t : insert tab
		 * \b: insert backspace
		 * \n: insert newline
		 * \': insert single quote
		 * \": insert double quote
		 * \\: insert backslash
		 * 
		 */
		
		//if we want to put quotes within quotes we should use escape sequence
		
		System.out.println("She said \"Hello!\" to me");
		
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			System.out.println(Integer.valueOf(i));
		}
		
	}
	

}
