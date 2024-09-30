package assignments;
/*Method with Return Value (boolean) and with Parameters (String, String):

Assignment: Write a method to compare two strings and return true if they are equal, false otherwise.

Signature: public boolean compareStrings(String str1, String str2)
 * 
 
 */
public class MethodAssignment_11 {
	
	public static boolean compareStrings(String str1, String str2) {
		
		//check if both strings are null
		if(str1 == null && str2 == null) {
			return true;
		}
		//check if one string is null while other is not
		else if(str1 == null || str2 == null) {
			return false;
		}
		
		//compare the strings
		return str1.equals(str2);
	}
	
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = null;
		boolean result = compareStrings(str1,str2);
		System.out.println("Are the strings equal? "+result);
	}

}

/*Notes:
 *  == operator is for address comparision
 *  .equals() method is for content comparision
 *  In above method we should use .equals(), since we are comparing 2 contents.
 */

