package javaBasics;

public class MathematicalOperations {

	public static void main(String[] args) {
        System.out.println(9/2);//4
		
		System.out.println(9.0/2);//4.5
		System.out.println(9/2.0);//4.5
		System.out.println(9.0/2.0);//4.5
		
	//	System.out.println(9/0);//infinity,arithmetic exception by zero
		System.out.println(0/9);//zero
		System.out.println(9.0/0);//infinity

		System.out.println(9.0/0 + 1);//Infinity
		System.out.println(9/0.0);//infinity
		System.out.println(9.0/0.0);//infinity
	//	System.out.println(0/0);//arithmetic exception
	//	System.out.println(-1/0);//arithmetic exception
		System.out.println(2/9);//0
		System.out.println(0.0/0.0);//NaN -Not a Number
		System.out.println(0/0.0);//NaN
		System.out.println(0.0/0);//NaN
		
		//System.out.println(-12/0);
		System.out.println(0/9.0);//0.0
		System.out.println(10%2);//0
		System.out.println(9%2);//1
		System.out.println(100%3);//1
	//	System.out.println(9%0); //AE
		System.out.println(0%9);//0
		
		//By default System.out.println is a int
		
		//we can't add anything to infinity
		
		
		double num1 = 0.1;
		double num2 = 0.2;
		double sum = num1 + num2;
		System.out.println("sum is : " +sum);

	}

}
