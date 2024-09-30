package javaBasicsPractice;

public class Constructor1_Practice {
	int x;
	
	static int run(int x) {
		return x*10;
	}

	
	Constructor1_Practice(int x){
		this.x=x;
	}
	
	public static void main(String[] args) {
		Constructor1_Practice obj = new Constructor1_Practice(20);
		System.out.println(obj.x);
		Constructor1_Practice.run(10);

	}

}
