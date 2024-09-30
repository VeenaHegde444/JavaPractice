package javaBasicsPractice;

public class MethodChaining {
	
	public void m1() {
		System.out.println("calling from m1");
		//direct calling
		m2();
		m3();
       //static methods: direct calling
		t1();
		t2();
		t3();
	}	
	
	public void m2() {
		System.out.println("calling from m2");
		m3();
	//	m1();//StackOverflowError

	}
	public void m3() {
		System.out.println("calling from m3");	
		//m1();

	}
	
	public static void t1() {
		System.out.println("calling from t1");
	}
	public static void t2() {
		System.out.println("calling from t2");

	}
	public static void t3() {
		System.out.println("calling from t3");
	}

	public static void main(String[] args) {
		//create object to access non-static methods
		MethodChaining obj = new MethodChaining();
		obj.m1();


	}

}
