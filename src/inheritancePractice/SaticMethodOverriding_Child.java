package inheritancePractice;

public class SaticMethodOverriding_Child extends SaticMethodOverriding_Parent{
	
	
	//static variable
	
	static int a = 200;
	
	//try to override the static method of parent class
	//When we try to override the static method by entering '@Override' it will throw an error, & there is no triangle symbol on the left side 
	//so static methods can't be overridden
	
   // @Override
	public static void sayHello() {
		System.out.println("Parent---say hello");
	}

}
