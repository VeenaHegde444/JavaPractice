package methodOverloadingPrograms;

public class Program_6 {
	
	public Program_6(int i) {//1 parameter constructor
		System.out.println(1);//prints 1
	}
	
	public Program_6() {//default constructor
		this(10);//calling Program_6(int i) constructor by passing the argument as 10
		System.out.println(2);//prints 2
	}
	
	void Program_6() {//method
		System.out.println(3);//prints 3
	}
	
	void Program_6(int i) {//method
		System.out.println(4);//prints 4
	}

	public static void main(String[] args) {
		new Program_6().Program_6();//constructor chaining, prints 1 2 3

	}

}
