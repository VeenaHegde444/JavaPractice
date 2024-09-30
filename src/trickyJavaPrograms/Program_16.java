package trickyJavaPrograms;

public class Program_16 {

	public static void main(String[] args) {
		int x = 2;
		  int y = 0;
		  for (; y < 10; ++y) {// for(y=0;y<10;++y)
		   if (y % x == 0) { //
		    continue;
		   }
		   else if (y == 8) {
		    break;
		   }
		   else {
		    System.out.print(y + " ");
		   }
		 }
	}

}
//y=0, 0/2 = 0 ,true, continue
//y=1, 1/2 != 0, false, check condition 1 = 8, false, goes to else part and prints y=1
//y=2, 2/2 = 0, true, continue
//y=3 , 3/2 != 0, false, 3=8, false, prints y=3
//y=4 , 4/2, true ,continue
//y=5, 5/2 != 0, false, y=8, false, prints y=5
//y=6, 6/2 = 0 , true, continue
//y=7, 7/2 !=0 ,false, 7 = 8 , false, prints y =7
//y=8, 8/2 = 0 , continue
//y=9, 9/2 != 0 , false, 9 = 8, false, prints y=9
//Ans: 1 3 5 7 9