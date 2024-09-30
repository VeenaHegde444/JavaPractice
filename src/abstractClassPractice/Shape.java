package abstractClassPractice;

public abstract class Shape {
	
	//Instance variables
	
	int number;
	String name;
	
	
	
	//abstract method - no method body
	
	//when we are creating a abstract method in a abstract class it should have the keyword 'abstract' before the method name
	public abstract double getArea();
	
	//concrete method
	
	public void getInfo() {
		System.out.println("Get the info");
	}
	
	//can we have a final method in abstract class?
	// Yes, we can have.
	//But 'Shape' class itself can't be final, abstract & final both are not allowed, it can be either 'abstract' or 'final'.
	
	public final void sayHello() {
		System.out.println("Say Hello!");
	}
	
	//can we have a static method in abstract class?
	//Yes
	
	public static void getDetails() {
		System.out.println("Get the details");
	}

}
