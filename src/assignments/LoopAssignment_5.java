package assignments;

//Write a program in Java to print all the multiplication of 5 from 1 to 100 using 
//while /for/do-while loop
public class LoopAssignment_5 {

	public static void main(String[] args) {
/*		int i = 1;
		
		//using while loop
		
		while(i<=100) {		
			if(i%5 == 0) {
				System.out.println(i);
			}
			i++;
		}
		
		
		//using for loop
		
		for(int j = 1;j<=100;j++) {
			if(j%5 == 0) {
				System.out.println(j);
			}
		}
*/		
		//using do while loop
		
		int k = 1;
		do {
			if(k%5 == 0) {
				System.out.println(k);
			}
			k++;
			
		}
		while(k<=100);

	}

}
