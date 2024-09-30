package assignments;
/*Method with Return Value (String) and with Parameters (String[]):

Assignment: Write a method to concatenate all strings in a string array and return the concatenated string.

Signature: public String concatenateStrings(String[] strings)
 * 
 * 
 */
public class MethodAssignment_13 {
	
	public static String concatenateStrings(String[] str) {
		
		String myStr = "";
		for(String e: str) {
			myStr = myStr+e;
		}
		return myStr;
	}

	public static void main(String[] args) {
		String str[] = {"Naveen", "Automation", "Labs", "Java", "Selenium"};
		
		String s = concatenateStrings(str);
		System.out.println(s);

	}

}
