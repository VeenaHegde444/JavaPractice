package inheritancePractice;

public class SaticMethodOverriding_Main {

	public static void main(String[] args) {
		//to access static methods & variables we don't have to create object
		//static variables & methods will be stored in 'CMA'
		//Using className we can directly call static variables & methods
		
		SaticMethodOverriding_Parent.sayHello();
		System.out.println(SaticMethodOverriding_Parent.a);
		
		SaticMethodOverriding_Child.sayHello();//Inherited
		System.out.println(SaticMethodOverriding_Child.a);//child class variable
		

	}

}

/*
 * Notes:
 * Why we can't override static methods?
 * Ans: Static method is bound with the class, whereas instance method is bound with an object.
 * Static belongs to the class area, & instance belongs to the heap area.
 * 
 * Can we override the main() method?
 * Ans: No, main() method is static.
 * 
 * 
 */

