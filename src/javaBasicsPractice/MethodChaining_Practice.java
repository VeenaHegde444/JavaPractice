package javaBasicsPractice;

public class MethodChaining_Practice {
	
	public void m1() {
		System.out.println("calling from m1");
		//here m1() method can call m2() & m3() methods directly, since all are part of the same object body, so they can talk to each other 		
		//& resides in heap memory. So no need to create the object even though m2() is non-static.
		m2();	
	}	
	
	public void m2() {
		System.out.println("calling from m2");
		m3();
	}
	public void m3() {
		System.out.println("calling from m3");
		//from m3() try to call t1() method, using className we can call static method inside non-static method
		MethodChaining_Practice.t1();
		
	}
	
	public static void t1() {
		System.out.println("calling from t1");
		//here t1() method which is static can call t2() & t3() methods directly, since all are in cma 
		t2();
		
		// but we can't directly call non-static method inside static method, for that we need to create object
		
		MethodChaining_Practice obj1 = new MethodChaining_Practice();
		obj1.m1();
	}
	public static void t2() {
		System.out.println("calling from t2");
		//here t2() method which is static can call t1() & t3() methods directly, since all are in cma 
		t3();
		//if we have to call non-static method we need to create the object again

	}
	public static void t3() {
		System.out.println("calling from t3");
		//here t3() method which is static can call t1() & t2() methods directly, since all are in cma 

	}
	
		
	public static void main(String[] args) {
		//to access non-static methods, we need to create object
		
		MethodChaining_Practice obj = new MethodChaining_Practice();
		obj.m1();
		//obj.m2();
		//obj.m3();

		//static methods can be called using classname.methodname or directly
		
		MethodChaining_Practice.t1();
		//MethodChaining_Practice.t2();
		//MethodChaining_Practice.t3();
				
		//int c = sum(2,2);
		//System.out.println(c);
		

	}

}

//static method wants to call non-static method inside the class: how to do it?
//Ans: Create object to access the non-static method inside static method i.e t1() static method wants to access m1() method which is non-static
/*
Non-static calling Non-static : direct calling ( no object creation required)
Static calling static : direct/using class name
Non-static calling static : direct/using class name
Static calling non-static: create the object & call it

Here the problem is whenever static is calling non-static we need to create the object. To solve this problem we need to use 'call by reference'.

Call By Value :  whenever we are calling a method by passing the value is called call by value.

Refer CallByRefer_Practice class

*/