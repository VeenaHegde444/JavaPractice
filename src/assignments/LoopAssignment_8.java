package assignments;
//Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop.
public class LoopAssignment_8 {

	public static void main(String[] args) {
		//1.Print A-Z
		char ch = 'A';
		//using while loop
		while(ch<='Z') {
			System.out.println(ch+ " - "+(byte)ch);
			ch++;
		}
		
		System.out.println("****************************");
		//using for loop
		
		for(char c='A';c<='Z';c++) {
			System.out.println(c+ " - "+(byte)c);
		}
		
		System.out.println("****************************");
		//2.Print a-z
		char l = 'a';
		//using while loop
		while(l<='z') {
			System.out.println(l+" - "+(byte)l);
			l++;
		}
		
		System.out.println("*****************************");
		//using for loop
		for(char m ='a';m<='z';m++) {
			System.out.println(m+" - "+(byte)m);
		}
		
		System.out.println("*****************************");
		
		//3.Print 0-9
		
		char s = '0';
		//using while loop
		while(s<='9') {
			System.out.println(s+" - "+(byte)s);
			s++;
		}
		
		System.out.println("******************************");
		//using for loop
		for(char r='0';r<='9';r++) {
			System.out.println(r+" - "+(byte)r);
		}

	}

}
