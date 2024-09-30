package exceptionHandling_Practice;
/*Exception Handling:
 * We can handle exceptions using try/catch block.
 * try can't be alone, try should be with catch or finally.
 * printStackTrace() method will give the stack trace of the exception
 * try block always looks for finally block
 * sequence is try, catch & finally
 * It is recommended to have multiple catch blocks.
 * We shouldn't handle the exceptions in a single catch block using 'Exception' or 'Throwable' class
 * 
 */
public class Employee {

	String name;
	
	public static void main(String[] args) {
		System.out.println("A");
		
		try {
		Employee e = new Employee();
		e=null; //NPE
		e.name="Veena";
		
		}
		//Whenever there is a exception we should handle it using try/catch
		
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		
		//since we have handled NPE in try/catch, program won't terminate & it will go to next line of code & will execute 'Hello!'
		System.out.println("Hello!");
		
		try {
		int i = 9/0; //AE
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) { // if we catch with 'Exception' class we will not get to know what the exact error is even though it will handle the exception
			e.printStackTrace(); // not a good practice
		}
		
		catch(Throwable e) {// if we catch with 'Exception' class we will not get to know what the exact error is even though it will handle the exception
			e.printStackTrace();// not a good practice
		}
		System.out.println("Hi");
		
		
		

	}

}
