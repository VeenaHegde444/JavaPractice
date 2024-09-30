package javaBasicsPractice;

public class CallByReference_Practice {
	
	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}
	
	
	public static void t1(CallByReference_Practice p1) {	
		p1.m1(10);
		System.out.println(p1.name);
		System.out.println(p1.age);
		
	    p1.name="John";
	    p1.age=35;


	}

	public static void main(String[] args) {
		CallByReference_Practice obj = new CallByReference_Practice();
		
		System.out.println(obj.name);//null
		System.out.println(obj.age);//0
		
		//assign values
		obj.name="Veena";
		obj.age=30;
		
		System.out.println(obj.name);//Veena
		System.out.println(obj.age);//30
		
		obj.m1(10); //call by value
		
		//call non-static method
		
		CallByReference_Practice.t1(obj);//call by reference
		
		
		System.out.println(obj.name);//John
		System.out.println(obj.age);//35
		

	}

}
