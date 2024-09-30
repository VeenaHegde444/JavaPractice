package trickyJavaPrograms;

public class Program_10 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		a ^= b ^= a ^= b;
		System.out.println(a + "-" + b);

	}

}
//XOR