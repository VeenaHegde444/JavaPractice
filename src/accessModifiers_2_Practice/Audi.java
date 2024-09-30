package accessModifiers_2_Practice;

import accessModifiers_1_Practice.Car;

public class Audi extends Car{

//Implicit super constructor Car() is not visible for default constructor. Must define an explicit constructor
	//if we don't create a constructor in Audi class then we will get above error
	//define constructor in Audi, then call parent class constructor using super keyword
	
	public Audi(String name, String color, int price) { 
		super(name, color, price);
		
	}

	public static void main(String[] args) {
		
		//different package, subclass
		
		//when creating the object of 'Car'class in different package , we need to import the package even though it is inherited
		
		//accessing Car class variables: we can access protected & public variables
		Audi a = new Audi("Audi","White",4500000);
		
		System.out.println(a.price);
		System.out.println(a.color);
		
		//accessing Car class methods: we can access protected & public methods
		
		a.getPrice();
		a.getColor();
		
		
	//	Car c = new Car();//the constructor is not visible
		//in 'Car' class if we have default constructor, then we can't access it in different package
		//we can access only protected & public constructor in different package
		// If Car is in a different package and the default constructor is not public or protected, it won't be accessible from a subclass
		//in another package.

	}

}

/*The error Implicit super constructor Car() is not visible for default constructor. Must define an explicit constructor occurs because the default 
 * constructor of the Car class is not accessible.
If Car has no explicitly defined constructors, a default constructor Car() would be generated with the same access level as the class. 
If Car is in a different package and the default constructor is not public or protected, it won't be accessible from a subclass in another package.
If Car has explicitly defined constructors but no no-argument constructor, the subclass must explicitly call one of the existing constructors
 using super() with appropriate arguments.
 * 
 * 
 * 
 * 
 */
