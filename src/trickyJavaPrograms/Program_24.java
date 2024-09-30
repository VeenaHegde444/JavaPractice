package trickyJavaPrograms;

public class Program_24 {

	public static void main(String[] args) {
		  int x = 10;
		  int y = 20;
		  int z = x += y -= x += y;//
		  System.out.println(z);

	}

}

//verify from right to left
//x += y => x = x+y = 10+20=30
//x += y => x = x+y = 10+20=30
//x = x-y = 30-30 =0
//Ans:0