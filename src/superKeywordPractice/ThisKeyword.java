package superKeywordPractice;
/*'this' : It is used to refer current class instance as well as static members.
 * It is used to invoke current class constructor.
 * It can be passed as an argument in the method call.
 * It can be passed as an argument in the constructor call.
 * It can be used to return the current class instance.
 * 
 */
public class ThisKeyword {
	
	//instance variable
	int a=10;
	
	//static variable
	static int b=20;
	
	//non-static method
	
	public void sayHello() {
		//referring current class instance variable inside method
		
		this.a=100;
		System.out.println(a);
		
		//referring current class static variable inside method
		
		this.b=200;
		System.out.println(b);
		
		//we can use 'this' any no. of times.
		
		this.a=500;
		System.out.println(a);
	}
	
	//static method
	
	public static void sayHi() {
		System.out.println("Hi Hello!");		
	}
	
	//constructor
	
/*	public ThisKeyword(int a, int b) {
		this.a=a;
		this.b=b;
	}
*/
	public static void main(String[] args) {
		
		//We can't use 'this' inside static area, we get compile time error, can't use this as static context
		//this.a;
		
		
		
		ThisKeyword obj = new ThisKeyword();
		System.out.println(obj.a);//10
        obj.sayHello();
 
		//static method & static variable can be accessed using className
		ThisKeyword.sayHi();
		System.out.println(ThisKeyword.b); //20


	}

}


