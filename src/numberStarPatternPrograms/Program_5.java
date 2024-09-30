package numberStarPatternPrograms;
/*
 * WAP for the below pattern
7
7 6
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2
7 6 5 4 3 2 1
 */
public class Program_5 {

	public static void main(String[] args) {
		for(int i=7;i>=1;i--) {
			for(int j=7;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}

//1. i=7, j runs from 7 to 7, prints 7 
//2. i=6, j runs from 7 to 6, prints 7 6
//3. i=5, j runs from 7 to 5, prints 7 6 5 
//4. i=4, j runs from 7 to 4, prints 7 6 5 4
//5. i=3, j runs from 7 to 3, prints 7 6 5 4 3
//6. i=2, j runs from 7 to 2, prints 7 6 5 4 3 2
//7. i=1, j runs from 7 to 1, prints 7 6 5 4 3 2 1