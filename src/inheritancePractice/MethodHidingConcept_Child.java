package inheritancePractice;

public class MethodHidingConcept_Child extends MethodHidingConcept_Parent{
	
	//define a static method with a same signature as parent class
	
	public static void sayHello() {
		System.out.println("Hello from Child");
	}

}
