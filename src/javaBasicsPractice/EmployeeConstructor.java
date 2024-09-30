package javaBasicsPractice;

public class EmployeeConstructor {
	
	//global or instance variables which will be stored in heap, one copy will be given to each object
	String name;
	int age;
	double salary;
	char gender;
	boolean isPermanent;
	
	static final String companyName="IBM"; //static variables can be accessed directly, final variable values can't be changed
	
	public EmployeeConstructor(String name, int age) {//here name & age are local variables which will be stored in stack
		//this.global variable = local variable
		this.name=name;
		this.age=age;
		
	}
	
	//constructor overloading
	//same name with different no. of input parameters or type of input parameter or mixture of both
	
	public EmployeeConstructor(String name, int age,double salary) {
		//this.global variable = local variable
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public EmployeeConstructor(String name, int age,double salary,char gender) {
		//this.global variable = local variable
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
	}
	
	public EmployeeConstructor(String name, int age,double salary,char gender,boolean isPermanent) {
		//this.global variable = local variable
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		this.isPermanent=isPermanent;
	}
	
	//easy way to create constructor
	/*1.right click eclipse editor >> Source >> Generate Constructor using Fields >> Select fields to Initialize >> Generate
	 * 
	 * */
	 
	public static void main(String[] args) {
		//create object before creating constructor
		
/*		EmployeeConstructor e1 = new EmployeeConstructor();
		e1.name="Veena";
		e1.age=30;
		e1.salary=20.56;
		e1.gender='f';
		e1.isPermanent=true;
		
		System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+e1.gender+" "+e1.isPermanent);
*/		
		//once we create the constructor, jvm will not call the default constructor 
		
		EmployeeConstructor e1 = new EmployeeConstructor("Veena",30);

		EmployeeConstructor e2 = new EmployeeConstructor("Sneha",25,20.56);
		EmployeeConstructor e3 = new EmployeeConstructor("Vimal",45,45.36,'m');
		EmployeeConstructor e4 = new EmployeeConstructor("Sachin",20,8.0,'m',false);
		
		System.out.println(e1.name+" "+e1.age+" "+EmployeeConstructor.companyName);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+EmployeeConstructor.companyName);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.gender+" "+EmployeeConstructor.companyName);
		System.out.println(e4.name+" "+e4.age+" "+e4.salary+" "+e4.gender+" "+e4.isPermanent+" "+EmployeeConstructor.companyName);
		
		
	}

}
