package assignments;
//Print all odd and even numbers between 1 to 100
public class LoopAssignment_6 {

	public static void main(String[] args) {
		//print even numbers
		System.out.println("Even numbers between 1 to 100:");
		int i =1;
		while(i<=100) {
			if(i%2 == 0) {
				System.out.print(i+",");
			}			
			i++;
		}
	
		System.out.println();
		
		//print odd numbers
		System.out.println("Odd numbers between 1 to 100:");
		int j = 1;
		while(j<=100) {
			if(j%2 != 0) {
				System.out.print(j+",");
			}
			j++;
		}

	}

}
