package trickyJavaPrograms;

public class Program_17 {

	public static void main(String[] args) {
		try {
			   int a = 10 / 0;
			   System.out.println("This will not be printed");
			  } catch (Exception e) {
			   System.out.println("Exception caught");
			  } finally {
			   System.out.println("Finally block executed");
			  }

			 

	}

}
//10/0 = arithmetic exception
//control goes to catch block
//prints Exception caught 
//goes to finally block & prints Finally block executed