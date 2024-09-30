package numberStarPatternPrograms;
/*
 * WAP for the below pattern
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7
 */
public class Program_3 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
//inside inner loop current value of 'i' is printed 
//1. i=1, j runs from 1 to 1, prints 1
//2. i=2, j runs from 1 to 2, prints 2 2
//3. i=3, j runs from 1 to 3, prints 3 3 3
//4. i=4, j runs from 1 to 4, prints 4 4 4 4
//5. i=5, j runs from 1 to 5, prints 5 5 5 5 5
//6. i=6, j runs from 1 to 6, prints 6 6 6 6 6 6
//7. i=7, j runs from 1 to 7, prints 7 7 7 7 7 7 7
