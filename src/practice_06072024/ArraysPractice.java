package practice_06072024;

import java.util.Arrays;

public class ArraysPractice {

	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5};
		System.out.println(arr[0]);//1
		System.out.println(arr[4]);//5
	//	System.out.println(arr[5]);//AIOB
	//	System.out.println(arr[-1]);//AIOB

		//iterate through an array & print all values
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int nos[]= {1,2,3,4,5};
	   System.out.println(Arrays.toString(nos)); // don't create the className 'Array', when we try to print Arrays.toString it doesn't work.
		
		String[] str = {"JAVA","PYTHON","GO","RUBY","JAVASCRIPT"};
		
		System.out.println(str[3]);//RUBY
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
			
			
			
			int[] arr1 = {10,20,30,40,50,60};
			//iterate using for each loop
			
			for(int e: arr1) {
				System.out.println(e);
			}
			
			Object[] obj = {"Veena",30,"Bengaluru",100000};
			for(Object e: obj) {
				System.out.println(e);
			}
		}
		

		
		
	}

}
