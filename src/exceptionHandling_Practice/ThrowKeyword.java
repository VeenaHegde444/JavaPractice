package exceptionHandling_Practice;

public class ThrowKeyword {

	public static void main(String[] args) {
		String data = null;
		if(data == null) {
			throw new RuntimeException("DATANOTFOUDEXCEPTION"); //create object of RuntimeException
		}
		
		System.out.println("Bye");//dead code

	}

}

//what if we want to use this feature again & again
//create MyException class which extends RuntimeException class