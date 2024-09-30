package superKeywordPractice;

public class Honda extends Car{
	
	public Honda() { // first it will go to parent 'Car' class default constructor
		this(10); //calling 1 parameter constructor
		//super(10);//not allowed
		System.out.println("Honda--default constructor");
	}
	
	public Honda(int a) {
        this(10,20); // calling 2 parameter constructor
		System.out.println("Honda--1 parameter constructor");
	}
	
	public Honda(int a, int b) {
		System.out.println("Honda--2 parameters constructor");
	}

}
