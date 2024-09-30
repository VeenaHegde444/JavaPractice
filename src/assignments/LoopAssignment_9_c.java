package assignments;
//Write a Java program to print the series of floating-point numbers from 1.0 to 10.0.
public class LoopAssignment_9_c {

	public static void main(String[] args) {
		//using for loop
		for(float f=1.0f;f<=10.0f;f++) {
			System.out.println(f);
		}
		
		System.out.println("*******************");
		//using while loop
		float a = 1.0f;		
		while(a<=10.0f) {
			System.out.println(a);
			a++;
		}
		

	}

}
