package exceptionHandling_Practice;
/*
 * 'finally' block return value will override the return value of try/catch block 
 * preference will be given to 'finally' block when there is a return statement
 * 
 * System.exit() : it will shutdown the JVM, finally will not be executed
 */
public class FinallyWithReturnKeyword {
	
	public static int getMarks(String studentName) {
		
		System.out.println("getting marks for: "+studentName);
		
		if(studentName.equals("peter")) {
			try {
				int i =9/0;
				System.exit(1);
				return 50;
			}
	/*		catch(ArithmeticException e) {
				return 10;
			}
	*/		finally {
				System.out.println("Bye!");
			//	return 80;
			}
		}
		else if(studentName.equals("mark")){
			return 90;
		}
		else if(studentName.equals("john")) {
			return 100;			
		}
		else {
			System.out.println("No student found..");
			return -1;
		}
	}

	public static void main(String[] args) {
		//using classname we can access static methods
		
	//	int result = FinallyWithReturnKeyword.getMarks("john");
	//	System.out.println(result); // will print 100

		//1. return in catch & finally block
		int m1 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m1); // will print 80, here finally block return 80 will override the catch block of return 10
		
		//2. no return in catch block
		int m2 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m2); // will print finally block return 80
		
		//3. return in try block, no return in catch block
		
		int m3 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m3); // will print 80,here finally block return 80 will override the try block of return 50
		
		//4. no return in finally block, return in try/catch block
		
		int m4 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m4); // will print 10, catch block return 10 will be printed
		
		//5. no return in finally block, no catch block, return in try block, exception in try block
		
		int m5 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m5); //since there is a exception, we are not handling in catch block,it will not print return value
		
		//6.no return in finally block, no catch block, return in try block, no exception
		
		int m6 = FinallyWithReturnKeyword.getMarks("peter");
		System.out.println(m6); //will print 50
			
		
		int result2 = FinallyWithReturnKeyword.getMarks("veena");
		System.out.println(result2); // will print -1 ,since name is not equal to 'peter','mark','john', it will not go to try/catch block
		
		// 1. System.exit(1) in try block , no exception in try block, finally will not be executed
		
		//2. System.exit(1) in try block, with exception, 
		/*
		 * 	if(studentName.equals("peter")) {
			try {
				int i =9/0;
				System.exit(1);
				return 50;
			}
		 * 
		 * In this case, whenever there is an exception, it will immediately go to catch block & finally block will be executed even though there
		 * is a System.exit(1) in try block.
		 */
	}

}
