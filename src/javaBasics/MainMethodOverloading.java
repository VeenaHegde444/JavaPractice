package javaBasics;

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("hello");

		MainMethodOverloading.main(10);
		
		
	}

//	public static void main(String arg1[], String arg2[]) {
//		System.out.println("Naveen");
//	}

	public static void main(int a) {

		System.out.println("hii " + a);

		MainMethodOverloading.main(a, 30);
	}

	public static void main(int a, int b) {

		System.out.println("bye " + (a + b));
	


	}

}
