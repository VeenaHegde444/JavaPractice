package javaBasicsPractice;
//is method overloaded or duplicated?
public class MethodOverload_Practice {
	
	public void method(int ... a) {
		System.out.println(1);
	}
	
	public void method(int[] ... a) {
		System.out.println(2);
	}


	public static void main(String[] args) {
		MethodOverload_Practice obj = new MethodOverload_Practice();
		obj.method(10);
		//obj.method(12);
		

	}

}

//Ans: Duplicated. Because, var args (int … a) are nothing but the arrays. So here, (int … a) and (int[] a) are the same.