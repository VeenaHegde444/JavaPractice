package javaBasics;

public class Continue_Statement {

	public static void main(String[] args) {
		//inside for loop
		for(int i=0;i<=15;i++) {
			if(i == 10 || i == 12) {
				continue; //it is used to skip the execution when i=10 & i=12
			}
			System.out.println(i+" ");
		}
		System.out.println("*******************");
		
		//inside while loop
		int count = 20;
		while(count>0) {
			if(count == 7 || count == 10) {
				count--;
				continue;
			}
			System.out.println(count+" ");
			count--;
		}

	}

}
