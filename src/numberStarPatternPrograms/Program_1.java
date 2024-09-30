package numberStarPatternPrograms;
/*WAP for the below pattern
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7

 */
public class Program_1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
//Outer loop: for(int i=1;i<=7;i++) 
//the outer loop runs with the loop variable 'i' starting from 1, incrementing by 1 until i=7, outer loop will control the no. of lines that will be printed
//Inner loop: for(int j=1;j<=i;j++)
//For each iteration of the outer loop, the inner loop runs with the loop variable j starting from 1 and incrementing by 1 until it reaches the value of i.
//this controls the numbers that will be printed on each line
//1. i=1, j runs from 1 to 1, prints 1
//2. i=2, j runs from 1 to 2, prints 1 2
//3. i=3, j runs from 1 to 3, prints 1 2 3
//4. i=4, j runs from 1 to 4, prints 1 2 3 4
//5. i=5, j runs from 1 to 5, prints 1 2 3 4 5
//6. i=6, j runs from 1 to 6, prints 1 2 3 4 5 6
//7. i=7, j runs from 1 to 7, prints 1 2 3 4 5 6 7