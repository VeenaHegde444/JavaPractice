package exceptionHandling_Practice;
/* use cases of 'finally':
 * 1. It is used to put important codes such as clean up code, close the file, closing DB connection etc
 * 2. 'finally' block will get executed whether the exception is handled or not 
 * 
 * 
 */
public class FinallyKeyword {

	public static void main(String[] args) {
		
		//1. in case of no exception
		
		try {
			System.out.println("inside try block");
			int i = 9/3;
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally block: i always execute");
		}
		
		System.out.println("*******************");
		
		//2. when exception occurs & handled in try/catch block
		
		try {
			System.out.println("inside try block");
			int i = 9/0; //exception occurs
			System.out.println(i);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally block: i always execute");
		}
		
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
		
		//3. when exception occurs & but not handled in try/catch block
		
		try {
			System.out.println("inside try block");
			int i = 9/0; //exception occurs
			System.out.println(i);
		}

		finally {
			System.out.println("inside finally block: i always execute");
		}
		
		System.out.println("Hello"); // in this case 'Hello' will not be printed because, we are not handling the exception in catch block
		//so program will be terminated after finally block

	}

}
