package javaBasicsPractice;

public class A {

	public static void main(String[] args) {
		System.out.println("A - main");
		//call B class main() method using className
		
		B.main(args);

	}

}

/*How to call B class main() method in class A?

Ans: Using className
i.e:  B.main(args)

When we run the A class, JVM will call the main method & prints 'A - main', then A class will call B class main() method & prints 'B - main'.
Here package doesn't matter.


*/