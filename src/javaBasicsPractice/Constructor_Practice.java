package javaBasicsPractice;

public class Constructor_Practice {
	final String a;
	final String c;
	int b;

/*	public Constructor_Practice(){// default constructor
		this.a="Ryan";
	}
*/
	
	public Constructor_Practice(String x){ //1 parameter constructor
		//this.global=local
		this.a=x;
		this.c="New York";
		
	}
	
	public Constructor_Practice(String x,int b,String c){ //2 parameter constructor
		this.a=x;
		this.b=b;
		this.c=c;
	}
	

	public static void main(String[] args) {
		
		Constructor_Practice obj = new Constructor_Practice("Sam");
		System.out.println(obj.a+" "+obj.c);//calling 1 parameter constructor
		
		Constructor_Practice obj1 = new Constructor_Practice("Peter",10,"India");
		System.out.println(obj1.a+" "+obj1.b+" "+obj1.c);//calling 2 parameter constructor
		
		

	}

}
