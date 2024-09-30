package assignments;
//5. Def﻿ine a program to find out whether a given number is even or odd - return true/false.
public class MethodAssignment_05 {
	
	public static boolean findEvenOrOdd(int number) {
		
		return number % 2 == 0;
			
	}

	public static void main(String[] args) {
	boolean a= findEvenOrOdd(5);
	System.out.println("Entered number is even? "+a);
	boolean b=findEvenOrOdd(10);
	System.out.println("Entered number is even? "+b);
	}

}
