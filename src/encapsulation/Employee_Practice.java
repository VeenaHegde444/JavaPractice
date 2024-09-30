package encapsulation;

public class Employee_Practice {
	
	//private class variables
	private String name;
	private int age;
	private double salary;
	private boolean isPerm;
	static String compName="IBM";
	
	//public constructor
	//if we create a private constructor we can't create the object, so constructor has to be public
	
	public Employee_Practice(String name,int age,double salary,boolean isPerm) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isPerm=isPerm;
		
	}	
	
	//public getter & setter methods
	//right click >> source >> generate getters & setters >> select all >> select public >> generate
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}	

}
