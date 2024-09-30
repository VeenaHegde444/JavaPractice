package assignments;
//Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘.
public class LoopAssignment_10 {

	public static void main(String[] args) {
		//using for loop
		for(char ch='a';ch<='z';ch++) {
			if(ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch+" ");
			}
		}
		
		System.out.println("*********************");
		//using while loop
		char c = 'a';
		while(c<='z') {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println(c+" ");
			}
			c++;
		}

	}

}
