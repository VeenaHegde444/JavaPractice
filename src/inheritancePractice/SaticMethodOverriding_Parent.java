package inheritancePractice;

public class SaticMethodOverriding_Parent {
	
	//static variable
	
	static int a = 100;
	
	//static method
	
	public static void sayHello() {
		System.out.println("Parent---say hello");
	}

	//static method overloading is allowed
	public static void sayHello(int a) {
		System.out.println("Parent---say hello");
	}
}
