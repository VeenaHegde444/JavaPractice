package assignments;

import java.util.Scanner;

/*8. Write a program to print the factorial of a number by defining a method named 'Factorial'.

Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-

4! = 1*2*3*4 = 24

3! = 3*2*1 = 6

2! = 2*1 = 2 

Also,

1! = 1

0! = 1
 * 
 * 
 * 
 */
public class MethodAssignment_08 {
	
	//formula for factorial:
	//n!=n*(n-1)*....*1
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Factorial of given number is: " +factorial(1));
		
		//Using Scanner class
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int result = factorial(num);
		System.out.println("The factorial of "+ num + " is: "+result);

	}

}
