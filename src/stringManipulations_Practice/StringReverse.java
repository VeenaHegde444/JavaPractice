package stringManipulations_Practice;

public class StringReverse {
	
	public static String reverseString(String str) {
		
		//1. check given string is null or not, this has to be the first check
		
		if(str== null) {
			throw new RuntimeException("Value can't be null");
		}
		
		//2. check the length 0 or 1
		
		if(str.length() == 1 || str.length() ==0) {
			return str;
		}
		
		//3. 
		
		int len=str.length();//8, first find the length of the string
		String rev="";// initialize string to nothing
		//System.out.println(rev.length());
		for(int i=len-1;i>=0;i--) { //in for loop i has to start from length-1
			rev=rev+str.charAt(i); // concatenate rev with each character
		}
		return rev;
	}

	public static void main(String[] args) {
		//test cases
		System.out.println(reverseString("selenium"));
		System.out.println(reverseString("T"));//T
		//System.out.println(reverseString(null));
		System.out.println(reverseString("").length());//
		System.out.println(reverseString(" ").length());//space
		System.out.println(reverseString("123"));//321
		System.out.println(reverseString("null"));//llun
		System.out.println(reverseString("testing "));// gnitset

	}

}
