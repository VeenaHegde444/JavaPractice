package javaBasicsPractice;

public class EmployeeObj_Practice {
	
	//instance or class or global variables
	String name;
	int age;
	double salary;
	char gender;
	boolean isPermanent;

	public static void main(String[] args) {
		//create object
		EmployeeObj_Practice obj = new EmployeeObj_Practice();
		
		//assign values
		obj.name = "Veena";
		obj.age=30;
		obj.salary=320.32;
		obj.gender='f';
		obj.isPermanent=true;
		
		System.out.println(obj.name+" "+obj.gender);
		
		obj=null;
		
		//if we try to access anything now will get NPE
		
		System.out.println(obj.name);//NullPointerException(NPE)
		
		//String s = null;
		//System.out.println(s.equals(obj));//NullPointerException
		
	
		
		
		
		System.gc();//system provided method

	}

}
