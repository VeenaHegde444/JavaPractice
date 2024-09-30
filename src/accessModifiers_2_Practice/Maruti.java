package accessModifiers_2_Practice;

import accessModifiers_1_Practice.Honda;

public class Maruti extends Honda{
	//different package, subclass
	
	public Maruti() {
		super("Honda-H1",1000000);
	}

	public static void main(String[] args) {
	

	}

}

/*
 * 
 * Default Constructor Visibility:

In Java, if you don't explicitly define any constructors in a class, the compiler provides a default no-argument constructor. 
This default constructor has the same access modifier as the class.
If a class explicitly defines at least one constructor (with or without parameters), the compiler does not generate a default no-argument constructor. 
You must define it yourself if you need one.



 * The error Implicit super constructor Car() is not visible for default constructor. Must define an explicit constructor occurs because 
 * the default constructor of the Car class is not accessible.
 * 
If Car has no explicitly defined constructors, a default constructor Car() would be generated with the same access level as the class.
 
If Car is in a different package and the default constructor is not public or protected, it won't be accessible from a subclass in another package.

If Car has explicitly defined constructors but no no-argument constructor, the subclass must explicitly call one of the existing constructors using 
super() with appropriate arguments.
 */


