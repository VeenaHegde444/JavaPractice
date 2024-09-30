package javaBasicsPractice;

public class B {

	public static void main(String[] args) {
		
		System.out.println("B - main");
		//A.main(args);

	}

}

/*
What happens if we call A class main() method in B class?

Ans: It will throw an StackOverflowError, because first JVM will call the main method of B class & prints 'B - main', then it will go to class A & prints 'A - main'
again it will come back to B class & print 'B - main' & it continues till stack will get filled and no more space left & it will throw an 
'StackOverflowError'.




*/