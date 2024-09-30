package javaBasicsPractice;

public class NestedLoops_Practice {

	public static void main(String[] args) {
		//print below pattern
		/* 00 01 02 03 04 05
		 * 10 11 12 13 14 15
		 * 20 21 22 23 24 25
		 * 30 31 32 33 34 35
		 * 40 41 42 43 44 45
		 * 50 51 52 53 54 55
		 * 
		 */
		
		
/*		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				System.out.print(i+""+j+" ");
				break;
			}
			
			System.out.println();
			break;
		}
	
*/



//first inner loop will be iterated, once the condition is satisfied then it will go to outer loop 
//i=0,j=0..break-come out of inner loop,now i=1& j=0,come out of inner loop & so on
//final output when break inside the inner array: 00 10 20 30 40 50
//if we use break for out for loop: it will print only 00

//print in reverse order

/*for(int i=5;i>=0;i--) {
	for(int j=5;j>=0;j--) {
		System.out.print(i+""+j+" ");
	}
	System.out.println();

}
*/
//print below pattern
		/* 000 001 002 003 004 005
		 * 10 11 12 13 14 15
		 * 20 21 22 23 24 25
		 * 30 31 32 33 34 35
		 * 40 41 42 43 44 45
		 * 50 51 52 53 54 55
		 * 
		 */
		
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5;j++) {
				for(int k=0;k<=5;k++) {
					System.out.print(i+""+j+""+k+" ");
				}
				System.out.println();
			}
			System.out.println();
		}



	}
}	
