package assignments;
//4. Define two methods to print the maximum and the minimum number respectively among three numbers.
public class MethodAssignment_04 {
	//print maximum number
	public static void printMaxNumber(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println("Maximum number is: "+a);
		}
		else if( b>a && b>c) {
			System.out.println("Maximum number is: "+b);
		}
		else if(c>a && c>b) {
			System.out.println("Maximum number is: "+c);
		}
	}
	
	//print minimum number
	
	public static void printMinNumber(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.println("Minimum number is: "+a);
		}
		else if( b<a && b<c) {
			System.out.println("Minimum number is: "+b);
		}
		else if(c<a && c<b) {
			System.out.println("Minimum number is: "+c);
		}
	}
	

	public static void main(String[] args) {
		printMaxNumber(2,6,4);
		printMinNumber(5,1,9);

	}

	

}
