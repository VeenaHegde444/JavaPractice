package javaBasicsPractice;

public class CallByRef_Practice {
	
	int a;
	int b;
	
	public void add(int a) {
		System.out.println(a);
	}
	
	public static void sum(int a, int b,CallByRef_Practice p) {
		System.out.println(a);
		System.out.println(b);
		p.add(25);
		
	}

	public static void main(String[] args) {
		CallByRef_Practice obj = new CallByRef_Practice();
		obj.add(10);
		
		CallByRef_Practice.sum(5, 5, obj);//call by reference

	}

}
