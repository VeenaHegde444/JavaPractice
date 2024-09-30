package exceptionHandling_Practice;
/*throw: user-defined exception or custom exception deliberately 
 *  whenever we want to throw custom exception
 *  when ever we are writing switch case statement in the default we will have our own exception, after that we don't want to proceed further
 * 
 * It doesn't make any sense to handle try/catch for 'throw' or user-defined exceptions
 */
public class AmazonTest {

	public static void main(String[] args) {
		String browser="veena";
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chrome");			
			break;
		case "firefox":
			System.out.println("launch firefox");			
			break;
		case "safari":
			System.out.println("launch safari");			
			break;
		case "edge":
			System.out.println("launch edge");			
			break;

		default:
			System.out.println("plz pass the right browser: " +browser);
			// add the custom exception here
			//create the object of custom class i.e MyException & pass the appropriate message
			//we have a constructor in MyException class
			//MyException class is behaving like a utility, whenever we want to use we can use it
			//it will be applicable for the garbage collector, before GC comes program execution will be over
			
			throw new MyException("WRONG BROWSER PASSED");
			// so we don't need break statement, since we are already throwing the exception
			//break;
		}
		
		//irrespective of browser, it will print all 4 below messages
		System.out.println("launch url");
		System.out.println("login to app");
		System.out.println("shop a product");
		System.out.println("close browser");

	}

}
