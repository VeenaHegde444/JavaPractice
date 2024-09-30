package constructorAssignments;

public class EmployeeMain {

	public static void main(String[] args) {
		//create instance of Employee class
		
		Employee emp1 = new Employee(1,"Roger",52000.0);
	    System.out.println(emp1.getId()+" "+emp1.getName()+" "+emp1.getSalary());
		
		Employee emp2 = new Employee(2,"Maya",35000.0);
		System.out.println(emp2.getId()+" "+emp2.getName()+" "+emp2.getSalary());
		
		Employee emp3 = new Employee(3,"Sam",25000.0);
		System.out.println(emp3.getId()+" "+emp3.getName()+" "+emp3.getSalary());
		
		//salary increase by 10% to emp1
		double raisePercentage=0.10;
		double raiseAmount=emp1.getSalary()*raisePercentage;
		double newSalary=emp1.getSalary()+raiseAmount;
		
		emp1.setSalary(newSalary);
		
		 System.out.println("After 10% raise,new salary:" +emp1.getSalary());
		
		
	}

}
