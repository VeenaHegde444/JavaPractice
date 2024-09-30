package javaBasicsPractice;

public class TimeComplexity_Practice {

	public static void main(String[] args) {
		//Constant:O(1)
		
		System.out.println("Hello");
		
		//Linear: O(n)
		
		for(int i=0;i<=10;i++) {
			System.out.println("Hello");
		}
		//Hello will be printed 10 times
		
		//Calculate sum of int a & b
		
		int a=10, b= 20;
		int sum = a+b;
		System.out.println("Sum is:"+sum);
		
		//it will take 2 units of time(constant), one for arithmetic operation & one for printing
		//1+1=2
		//TC=O(2)=O(1) , since 2 is constant

	}

}
