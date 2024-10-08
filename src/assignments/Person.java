package assignments;
/*Assignment 1:

Objective: The objective of this assignment is to create a class that uses encapsulation to protect its data and provide getter and setter methods for accessing the data.

Instructions:

Create a class called "Person" with the following private attributes: name (String), age (int), and gender (String).

Create getter and setter methods for each attribute.

Write a method called "printInfo" that prints out the name, age, and gender of the person.

Create an instance of the "Person" class and set its attributes using the setter methods.

Call the "printInfo" method to verify that the data was set correctly.

Questions:

What is encapsulation and how does it relate to object-oriented programming?

Why is it important to use getter and setter methods instead of accessing attributes directly?

How can encapsulation improve the security and reliability of a program?

What is the difference between a private attribute and a public attribute?

How does encapsulation help with code maintainability and scalability?
 * 
 * 
 */
public class Person {
	//private class variables
	private String name;
	private int age;
	private String gender;
	
	
	//public getters & setters
	
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		System.out.println("Person name is: "+name);
		System.out.println("Person age is: "+age);
		System.out.println("Person gender is: "+gender);
	}


}
