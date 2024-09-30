package inheritancePractice;

public class MethodHidingConcept_Main {

	public static void main(String[] args) {
		
		MethodHidingConcept_Child.sayHello();// child class method will be called

	}

}
/*

Method Hiding:
If a child class defines a static method with the same signature as a static method in the parent class, the method in the child class hides the
one in the parent class.
Here, method in the parent class is hidden by the child class.

The version of a method that is executed will not be determined by the object that is used to invoke it, since it is static,
& it is decided by the compiler at compile time itself.


Static methods are hidden, non-static methods are overridden.
*/