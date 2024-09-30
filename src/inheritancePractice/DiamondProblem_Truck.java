package inheritancePractice;

public class DiamondProblem_Truck {
	
	public void heavyLoading() {
		System.out.println("Truck--heavy loading");
	}

}

//Multiple Inheritance is not allowed in Java
//BMW can't have one more parent Truck
//We can create the Truck object in BMW class to access Truck's methods, it is called Composition. No relationship between Truck & BMW.
//if we want to access other child's method in this child class, then we need to create object of other class which is referring to this class child reference.
//this is called composition.
//HAS_A relationship, then it is called composition