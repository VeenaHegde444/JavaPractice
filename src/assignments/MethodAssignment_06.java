package assignments;
//6. A person is eligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is eligible to﻿ vote. - return true/false
public class MethodAssignment_06 {
	
	public static boolean isEligibleToVote(int age) {

		return age>=18;
	}

	public static void main(String[] args) {
	boolean eligibility =isEligibleToVote(20);
	System.out.println("He/She is eligible to vote? "+eligibility);
		

	}

}
