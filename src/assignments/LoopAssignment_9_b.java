package assignments;
//Develop a Java program to print the series of lowercase alphabets in reverse order from 'z' to 'a'.
public class LoopAssignment_9_b {

	public static void main(String[] args) {
		//using while loop
		char ch = 'z';
		while(ch>='a') {
			System.out.println(ch);
			ch--;
		}
		
		System.out.println("*****************");
		
		//using for loop
		for(char c='z';c>='a';c--) {
			System.out.println(c);
		}

	}

}
