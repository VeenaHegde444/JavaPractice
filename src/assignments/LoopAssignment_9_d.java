package assignments;
// Develop a Java program to print the series of numbers where each number is a multiple of 9, starting from 0 and ending at 99.
public class LoopAssignment_9_d {

	public static void main(String[] args) {
		//using for loop
		
		for(int i=0 ;i<=99;i++) {
			if(i%9 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("**************************");
		
		//using while loop
		
		int j = 0;
		while(j<=99) {
			if(j%9 == 0) {
			System.out.println(j);
			}
			j++;
		}

	}

}
