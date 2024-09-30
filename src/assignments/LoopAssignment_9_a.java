package assignments;
//Write a Java program to print the series of even numbers from 2 to 100, using for & while loops
public class LoopAssignment_9_a {

	public static void main(String[] args) {
		int i = 2;
		//using while loop
		
		while(i<=100) {
			if(i%2 == 0) {
			System.out.print(i+",");
			}
			i++;
		}
		
		System.out.println();
		//using for loop
		
		for(int j=2;j<=100;j++) {
			if(j%2 == 0) {
				System.out.print(j+",");
			}
		}

	}

}
