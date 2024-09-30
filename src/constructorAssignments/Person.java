package constructorAssignments;
/*Assignment 1:

Create a Java class named "Person" with the following instance variables:

name (String)

age (int)

gender (char)

height (double)

Create a constructor for the Person class that takes in the name, age, gender, and height as parameters and initializes the instance variables.

Create a main method that creates two instances of the Person class using the constructor and prints out their information.
 * 
 * 
 */
public class Person {
	
	//instance variables
	String name;
	int age;
	char gender;
	double height;

	
	//constructor
	
	public Person(String name, int age, char gender, double height) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
	}
}
