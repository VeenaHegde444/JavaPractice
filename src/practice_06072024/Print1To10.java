package practice_06072024;

public class Print1To10 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		
		
		//while loop: in while loop we have to initialize the variable before using it
		//print 1 to 10
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		//print 10 to 1
		int j =10;
		while(j>=1) {
			System.out.println(j);
			j--;
		}
		
		System.out.println("***************");
		
		int k=1;
		while (k<=10) {
			System.out.println(k++);
			break;
		}
		
		//print 1 to 10 using do-while loop
		
		
		do {
			System.out.println(i);
			i++;
		}
		while (i<=10);


	}

}
