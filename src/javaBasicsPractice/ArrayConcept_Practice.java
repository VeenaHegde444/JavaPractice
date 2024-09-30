package javaBasicsPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayConcept_Practice {

	public static void main(String[] args) {
/*		
	//Array is a collection of similar data type stored at contiguous memory locations.
		
		//static array -size is fixed, compile-time memory allocation
		//dynamic array - size is not fixed, run-time memory allocation Ex: ArrayList
		//index starts from 0 - lowest index =0
		//array length: arr.length (length is a variable);length = highest index +1
		//highest index: arr.length-1
		//ArrayIndexOutofBoundsException-AIOB
		//If we don't assign values it will take the default values. Ex: 0 for int, 0.0 for float
		//maximum no.s we can store in an array - no limit
		
		
		//array declaration: using new keyword
		int arr[] = new int[4];
		
		//before filling the values
		
		//System.out.println(arr[0]);//0-default value
		//System.out.println(arr[3]);//0-default value
		
		//insert values into array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		System.out.println(arr.getClass());
		
		//System.out.println(arr[-1]);
		//when we try to access the negative index: AIOB exception
		
		
		//print the array values
//		for(int i = 0 ;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		//if we use 'i<=' then we should use arr.length-1
		//if we use 'i<' then we should use arr.length
		
		//another way of printing array elements without using for loop
		System.out.println(Arrays.toString(arr));
		//Arrays-is a class
		//tString()- is a method
		
		
		
		int intArr[] = {};
		if(intArr.length>0) {
		int i=0;
		do {
			System.out.println(intArr[i]);
			i++;
		}
		while(i<intArr.length);
		
		}
		
		//while using do while loop,make sure to check if an array has at least one element.
		
		
		
		int array[] = new int[3];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		
		//Using Java 8 stream
		Arrays.stream(array).forEach(System.out::println);
		
		String str[] = {"One","Two","Three"};
		
		//Using Java 8 String join
		
		System.out.println(String.join(" ", str));
		
		
*/		
		int[] intArray = new int[100];
		int length=0;
		
		for(int i=0;i<100;i++) {
			intArray[length]=i;	
			length++;
		}
		for(int i=0;i<intArray.length;i++) {
		System.out.println(intArray[i]);
		}

	}

}

//memory address

