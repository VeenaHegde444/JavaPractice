package exceptionHandling_Practice;

public class ExceptionPractice {
	
	public static void division() {
		int a = 10;
		int b=0;
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
		public static void checkLength() {
			String str=null;
			try {
			System.out.println(str.length());
			}
			catch(NullPointerException e) {
				e.printStackTrace();
			}
		}
		
		
		public static void checkArray() {
			int[] arr= {1,2,3,4};
			try {
				System.out.println(arr[4]);				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
		}
	

	public static void main(String[] args) {
		
		ExceptionPractice ep = new ExceptionPractice();
		ExceptionPractice.division();
		ExceptionPractice.checkLength();
		ExceptionPractice.checkArray();

	}

}

//methods to print the exception:
//1.printStackTrace()
//2.toString()
//3.getMessage()