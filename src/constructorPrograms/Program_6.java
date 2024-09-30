package constructorPrograms;

public class Program_6 {
	
	static int a;
	
	//static block
	static {
		a=4;
		System.out.println("inside static block");
		System.out.println ("a =" + a);
	}
	
	//constructor
	Program_6(){
        System.out.println ("inside constructor");
        a = 10;
	}
	
	public static void fun() {
		a = a+1;
		System.out.println();
	}

	public static void main(String[] args) {
		Program_6 obj = new Program_6();
		Program_6.fun();//a=a+1 => a=10+1=11

	}

}

//Static blocks are called before constructors. Therefore, on object creation of class Test, static block is called. So, 
//static variable a = 4. Then constructor Test() is called which assigns a = 10. Finally, function func() increments its value.
