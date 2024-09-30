package javaBasicsPractice;

public class MathOperations_Practice {

	public static void main(String[] args) {
		
		int a = 10;	
		float b = 7.5f;
		int c = 5;
		// 1. Any integer divide by zero results in Arithmetic exception by zero
			
	//	System.out.println(a/0); //Arithmetic exception
		
		//2. Zero divide by any integer results in 0
		
		System.out.println(0/a); //0
		
		//3. Any integer or float divide by 0 or 0.0 results in Infinity
		
		System.out.println(a/0.0);//Infinity
		System.out.println(b/0);//Infinity
		System.out.println(b/0.0);//Infinity
		
		//4. int divided by int results in integer
		
		System.out.println(a/c);//int
		
		//5. Int divide by float or float divide by int results in float
		
		System.out.println(a/b);//float
		System.out.println(b/c);//float
		
		//6. Int 0 divide by float 0 OR float 0 divide by int 0 results in NaN
		
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		
		
		System.out.println(9.0/0 +1);//Infinity
		//System.out.println(0/0);//Arithmetic exception
		System.out.println(2/9);//0
		

	}

}
