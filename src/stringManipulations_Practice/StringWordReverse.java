package stringManipulations_Practice;
//Reverse the given string String test = "Java Python Ruby";
//Ans: avaJ nohtyP ybuR

public class StringWordReverse {
	
	public static String reverseEachWord(String str) {
		
		//check given string is null
		if(str == null) {
			throw new RuntimeException("Value can't be null");
		}
		
		//check given string is 0 or 1
		if(str.length() == 1 || str.length() == 0) {
			return str;
			
		}
		
		String words[] = str.split(" ");
		String reversedString="";
				
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseWord="";
			   for(int j=word.length()-1;j>=0;j--) {
				  reverseWord=reverseWord+word.charAt(j);
			}
			   reversedString = reversedString + reverseWord + " ";
		}
		
		return reversedString;
		
	}

	public static void main(String[] args) {
	System.out.println(reverseEachWord("Java Python Ruby"));
	System.out.println(reverseEachWord(" Java Python Ruby ").trim());

	}

}
