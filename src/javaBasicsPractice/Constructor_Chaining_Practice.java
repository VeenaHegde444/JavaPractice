package javaBasicsPractice;

public class Constructor_Chaining_Practice {
	
	int a;
	int b;
	
	
	//constructor

	Constructor_Chaining_Practice(){
		System.out.println("Default constructor");
	}
	
	Constructor_Chaining_Practice(int a){
		this();
		this.a=a;	
		System.out.println("One argument constructor");
	}
	
	Constructor_Chaining_Practice(int a,int b){
		this(1);
		this.a=a;	
		this.b=b;
		System.out.println("Two arguments constructor");
	}
	
	
	public static void main(String[] args) {
		Constructor_Chaining_Practice obj = new Constructor_Chaining_Practice();
		System.out.println("*********");
		Constructor_Chaining_Practice obj1 = new Constructor_Chaining_Practice(10);
		System.out.println("___________");
		Constructor_Chaining_Practice obj2 = new Constructor_Chaining_Practice(10,20);

	}

}
