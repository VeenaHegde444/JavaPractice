package trickyJavaPrograms;

public class Program_13 {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			   switch (i) {
			   case 0:
			    System.out.print("A");
			   case 1:
			    System.out.print("B");
			    break;
			   case 2:
			    System.out.print("C");
			   }
			  }

	}

}
// i=0, enters switch statement, prints 'A'
//no break in first switch, so it goes to second switch case
//prints 'B' & come out of switch statement
//now i=1, goes to switch case 1 & prints 'B' & break & come out of switch
//now i=2, goes to switch case 2 & prints 'C'
//now i=3, i<3 so comes out of for loop
//Ans: ABBC