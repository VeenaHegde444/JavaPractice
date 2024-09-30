package superKeywordPractice;
/*'this':
 * It is used to access the current class instance variables & static methods
 * It is used to invoke the constructor
 * 
 */
public class Browser implements Automation{

	//class implements the interface, it has to implement the abstract methods of interface
	
	//class/instance/global variables
	String name;
	double version;
	
	@Override
	public void sayHello() {
		System.out.println("Say hello!");
		
	}
	
	//to access Interface default method, create a public method in class
	
	//setter method
	public void addBrowser(String name, double version) { // here name & version are local variables
		//this.global=local
		this.name=name;
		this.version=version;
		
		System.out.println(Automation.time); //accessing Interface variable, we can access using InterfaceName.variable
		
		billing();// calling default method of Interface
		
		//to call Interface default methods, if 2 interfaces have the methods with same name, then we can access particular interface's 
		//method using the 'super' keyword
		Automation.super.billing();
	}	
	public void getInfo() {
		System.out.println(name+version);
	}	

	public static void main(String[] args) {
		Browser br = new Browser();
		br.addBrowser("chrome ", 122.32);
		br.getInfo();
		br.sayHello();
		
	}
	

}
