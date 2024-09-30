package trickyJavaPrograms;
//output of below code
public class Program_3 {

	public static void main(String[] args) {
		int x=10;
		int y=(x>5)?(x<10 ? 1:2) :3;
		System.out.println(y);

	}

}

//ternary operation: it is kind of if-else statement
//condition ? expression-if_true : expression_if_false