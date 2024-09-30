package inheritancePractice;

public class PrivateMethodOverriding_Main {

	public static void main(String[] args) {
		//create object of child class
		
		PrivateMethodOverriding_Child obj = new PrivateMethodOverriding_Child();
		//we can't access private methods & variables outside the class
		//the scope is within the class only
		//in order to access those methods we should have public getter & setter methods

	}

}

/*
 * Notes:
 * Why ca't we override private methods?
 * Ans: Because private methods are not visible to any other class which limits their scope to the class in which they are declared.
 */


