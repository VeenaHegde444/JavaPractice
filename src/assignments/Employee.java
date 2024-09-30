package assignments;
/*Define a class named Employee with the following attributes:

String name

int age

double salary

double totalSalary (to keep track of the total salary of all employees)

In the main method:

Create three Employee objects and initialize their properties with different values.

Print the details of each employee and the total salary of all employees.

Give a raise to one employee by increasing their salary, and update the total salary accordingly.

Create another Employee object with a different salary and update the total salary of all employees.

Print the details of the new employee and the updated total salary of all employees.
 * 
 * 
 * 
 * 
 */
public class Employee {
	
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		double totalSalary=0.0;
		
		//create 3 employees & initialize their properties
		
		Employee emp1 = new Employee();
		emp1.name="Veena";
		emp1.age=30;
		emp1.salary=1000;
		totalSalary += emp1.salary;
		
		System.out.println(totalSalary);
		
		Employee emp2 = new Employee();
		emp2.name="Rahul";
		emp2.age=35;
		emp2.salary=2000;
		totalSalary += emp2.salary;
		
		System.out.println(totalSalary);
		
		Employee emp3 = new Employee();
		emp3.name="Peter";
		emp3.age=25;
		emp3.salary=500;
		totalSalary += emp3.salary;
		
		System.out.println(totalSalary);
		
		
				
		System.out.println("Employee name:"+emp1.name+","+"Employee age:"+emp1.age+","+"Employee salary:"+emp1.salary);
		System.out.println("Employee name:"+emp2.name+","+"Employee age:"+emp2.age+","+"Employee salary:"+emp2.salary);
		System.out.println("Employee name:"+emp3.name+","+"Employee age:"+emp3.age+","+"Employee salary:"+emp3.salary);
		System.out.println("Total salary of all employees:"+totalSalary);
		
		//increase salary of one employee & update total salary
		
		emp3.salary=1500;
		totalSalary += emp3.salary;
		System.out.println("Employee name:"+emp3.name+","+"Employee age:"+emp3.age+","+"Employee salary:"+emp3.salary);
		System.out.println("Total salary of all employees:"+totalSalary);
		
		//create another employee & update total salary of all employees
		
		Employee emp4 = new Employee();
		emp4.name="Mary";
		emp4.age=40;
		emp4.salary=5000;
		totalSalary += emp4.salary;
		
		
		System.out.println("Employee name:"+emp4.name+","+"Employee age:"+emp4.age+","+"Employee salary:"+emp4.salary);
		System.out.println("Total salary of all employees:"+totalSalary);
		

	}

}
