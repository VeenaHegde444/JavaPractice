package practice_06072024;

public class WhileFor_Loops {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i++);
			if( i==5) {
				break;
			}
		}
		
		
		
		int j =1;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		
		int k = 1;
		while(k<=50) {
			System.out.println("Hello");
			k++;
			if(k==10) {
				break;
			}
		}
		
		//print 10 to 1
		
		int l=10;
		while(l>=1) {
			System.out.println(l);
			l--;
		}
		
		//print a -z
		char ch;
		for(ch='a';ch<='z';ch++) {
			System.out.println(ch+" "+(byte)ch);
		}
		
		//print A-Z
		
		char chr;
		for(chr='A';chr<='Z';chr++) {
			System.out.println(chr+" "+(byte)chr);
		}

		//print z-a
		
		char c;
		for(c='z';c>='a';c--) {
			System.out.println(c);
		}
		
		//infinite display of hotel name
		
	/*	for(;;) {
			System.out.println("Welcome to Hotel Taj!");
		}
	*/
		
		//will print Hello once
		for(;;) {
			System.out.println("Hello");
			break;
		}
		
		int n=1;
		while(true) {
			System.out.println(n);
			n++;
			if(n==5) {
				break;
			}
		}
		
		
		//do-while: minimum 1 time execution
		
		int m=1;
		do {
			System.out.println(m);
			m++;
		}
		while(m<=10);
		
		
		//dead code
		
		if(true) { //always true
			System.out.println("Hello");
		}
		else { //never reach here, since if condition is always true
			System.out.println("Hii");
		}
	}

}
