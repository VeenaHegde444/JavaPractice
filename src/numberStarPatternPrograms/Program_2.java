package numberStarPatternPrograms;

/*WAP for the below pattern
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 * 
 */

public class Program_2 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
//1. i=7, j runs from 1 to 7, prints 1 2 3 4 5 6 7
//2. i=6, j runs from 1 to 6, prints 1 2 3 4 5 6
//3. i=5, j runs from 1 to 5, prints 1 2 3 4 5
//4. i=4, j runs from 1 to 4, prints 1 2 3 4
//5. i=3, j runs from 1 to 3, prints 1 2 3 
//6. i=2, j runs from 1 to 2, prints 1 2 
//7. i=1, j runs from 1 to 1, prints 1 
