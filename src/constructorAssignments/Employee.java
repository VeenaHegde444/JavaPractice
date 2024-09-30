package constructorAssignments;
/*Create a Java class named "Employee" with the following instance variables:

id (int)

name (String)

salary (double)

Create a constructor for the Employee class that takes in the id, name, and salary as parameters and initializes the instance variables.

Create getter methods for each of the instance variables.

Create a main method that creates an instance of the Employee class using the constructor, prints out the employee's information using the getter methods, and gives the employee a 10% raise using the setter method for the salary instance variable.
 * 
 * 
 */
public class Employee {
	
	//instance variables
	int id;
	String name;
	double salary;
	
	//parameterized constructor
	
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	//getters & setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
		
		

}
