package exceptionHandling_Practice;
/*Compile time Exceptions Ex:
 * FileNotFoundException
 * SQLException
 * InterruptedException
 * IOException
 * 
 * Run time Exceptions Ex:
 * 
 * ArithmeticException
 * NullPointerException
 * ClassCastException
 * ArrayIndexOutOfBoundsException
 * 
 * Errors are runtime exceptions
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		int i=9/0; //RunTime exception
		
		try {
			FileInputStream fis = new FileInputStream("test.xls");//FileNotFoundException, it is a compile time exception
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	//	int p == 20; //syntax error
		
		try {
			Thread.sleep(2000); //InterruptedException, compile time exception
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 

	}

}
