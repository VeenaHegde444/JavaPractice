package javaBasicsPractice;

public class FunctionsInJava_Practice {
	
	/*non-static method inside the class : create object to access non-static variables & methods
	 * 
	 * Function variables are local variables
	 * Parameter: parameter means input values passed inside the function 
	 * Ex: public int add(int a, int b) Here a & b are parameters
	 * Argument: Actual value which will be passed when calling the function are called arguments
	 * Ex: classname.function_name(2,3) // Here 2,3 are arguments
	 * We can pass up to 255 parameters comma separated inside a function, we can't pass more than 255 input parameters
	 * Don't pass more than 7-8 parameters
	 * void- will not return anything
	 */
	
	
	
	//1.no input & no return method
	//no input parameters, no return keyword
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	//2. no input but returns something
	//no input parameters, returns sum
	
	public int getNumber() {
		System.out.println("Get number");
		int fee=100;;
		int tax=200;
		int totalTax=fee+tax;
		return totalTax;
	}
	
	public String getTrainerName() {
		System.out.println("Get trainer name");
		return "Naveen";
	}
	
	public boolean isUserActive() {
		System.out.println("User is active");
		return true;
	}
	
	//3.Some input but no return
	
	public void multiply(int a, int b) {
		int multiplication = a*b;
		System.out.println(multiplication);
	}
	
	//4. some input & returns something
	
	public int division(int a, int b) {
		int division = a/b;
		return division;
	}
	
	

	public static void main(String[] args) {

		//all are non-static methods, create object to access the methods.
		
		FunctionsInJava_Practice obj = new FunctionsInJava_Practice();
		obj.sayHello();//Hello
		int a = obj.getNumber();
		System.out.println(a);
		boolean b = obj.isUserActive();
		System.out.println(b);
		
		String s = obj.getTrainerName();
		System.out.println(s);
	
		obj.multiply(2, 2);
		obj.division(10, 5);


	}

}
