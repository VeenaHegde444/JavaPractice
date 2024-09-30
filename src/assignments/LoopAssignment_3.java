package assignments;

//WAP to print 10 to 1 using for, while and do-while loop

public class LoopAssignment_3 {

	public static void main(String[] args) {
		int i=10;
	
	//Using while loop	
		while(i>=1) {
			System.out.println(i);
			i--;
		}
				
	
		i=10;//reset i for the for loop
		
	//using for loop
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		i=10;//reset i for the do while loop
		
	//using do-while loop
		do {			
			System.out.println(i);
			i--;
		}
		while(i>=1);
		
	}

}
