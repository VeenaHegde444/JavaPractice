package assignments;
/*Method without Return Value (void) and with Parameters (String, boolean):

      Assignment: Write a method to print a message based on a boolean value (true for success, false for failure). 

Signature: public void printStatusMessage(String message, boolean isSuccess)

 * 
 */
public class MethodAssignment_16 {
	
	public static void printStatusMessage(String message, boolean isSuccess) {
		if(isSuccess) {
			System.out.println("Success: "+message);
		}
		else {
			System.out.println("Failure: "+message);
		}
	}

	public static void main(String[] args) {
		
		printStatusMessage("Operation completed successfully", true);
		printStatusMessage("Operation failed", false);
	}

}
