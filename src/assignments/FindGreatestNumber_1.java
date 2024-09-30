package assignments;
/*Find out the greatest number out of four different given numbers:

Input the 1st number: 25 

Input the 2nd number: 78 

Input the 3rd number: 87

Input the 4th number: 97

*/
public class FindGreatestNumber_1 {

	public static void main(String[] args) {
		
		int a = 25, b = 78, c = 87 , d =97;
		
		if(a>b && a>c && a>d) {
			System.out.println("The greatest number is: "+ a);
		}
		else if (b>a && b>c && b>d) {
			System.out.println("The greatest number is: "+ b);
		}
		else if(c>a && c>b && c>d) {
			System.out.println("The greatest number is: "+ c);
		}
		else {
			System.out.println("The greatest number is: "+ d);
		}
	}

}
