package trickyJavaPrograms;

public class Program_25 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 };
		  for (int num : nums) {
		   if (num % 2 == 0) {
		    continue;
		   }
		   System.out.print(num + " ");
		  }
		 

	}

}

//nums=1, 1%2 !=0, false, num=1
//nums=2, 2%2 = 0, true, continue
//nums=3, 3%2 != 0, false, num=3
//nums=4, 4%2 = 0 , true, continue
//nums=5, 5%2 !=0, false, num=5
//num= 1 3 5