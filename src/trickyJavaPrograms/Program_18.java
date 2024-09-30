package trickyJavaPrograms;

public class Program_18 {

	public static void main(String[] args) {
		int a = 5;
		  int b = 10;
		  if ((a = 3) == b) {
		   System.out.println(a);
		  } else {
		   System.out.println(a + b);//13
		  }

	}

}

//initially a=5, b=10
//reassign a=3 => 3 != 10 >> false
//3+10=13