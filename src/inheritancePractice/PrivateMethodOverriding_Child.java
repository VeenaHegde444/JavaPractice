package inheritancePractice;

public class PrivateMethodOverriding_Child extends PrivateMethodOverriding_Parent{
	
	//private variables
	
	private int a = 200;
	
	//try to override the private method of parent
	//We can't override the private methods, when we write '@Override' it will throw an error
	//
	//@Override
	private void sayHello() {
		System.out.println("Parent--say hello");
	}
	
	private void sayHello(int a) {
		System.out.println("private method-overloading");
	}
}
//we can overload the private method