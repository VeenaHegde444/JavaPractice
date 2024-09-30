package exceptionHandling_Practice;
/*finally:
 * 'try' is mandatory for 'finally' block 
 * 'finally' block will execute irrespective of exception is coming or not
 * try,catch,finally
 * try, finally without catch block is possible
 * 'try' always looks for 'finally' not 'catch'
 * 'finally' without 'try' not allowed
 * multiple 'finally' block is not allowed
 * after 'finally' we can't add 'catch' block, it should always comes with 'try' block
 * nested try/catch we can have, try/catch inside another try/catch
 * use case of 'finally':
 */
public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		
		try {
			int i = 9/3;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}

}
