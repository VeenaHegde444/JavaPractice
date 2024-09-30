package encapsulation;

public class Employee_Practice_Main {

	public static void main(String[] args) {
		//create object of Employee_Practice class
		
		//create-POST API call
		Employee_Practice obj = new Employee_Practice("Veena",30,20.23,true);
		
		//retrieve details-GET API call
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm()+" "+Employee_Practice.compName);
		
		//update salary details - PUT API call
		//to update details we need setter methods
		obj.setSalary(30.33);
		
		//retrieve details - GET API call
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm()+" "+Employee_Practice.compName);

	}

}
