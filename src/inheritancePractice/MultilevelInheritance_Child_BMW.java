package inheritancePractice;
/*	here 'BMW' child is extending his parent 'Car' class & indirectly can access properties of grandparent 'Vehicle' class
	child class can't directly access grandparent's properties
 * 'Car' & ' Vehicle' can't access the properties of 'BMW' class
 * 'BMW' doesn't like few methods given by 'Car' class so its like to override few methods
 */
public class MultilevelInheritance_Child_BMW extends MultilevelInheritance_Parent_Car{
	
	int speed = 500;
	
	@Override
	public void start() {
		System.out.println("BMW--start");
		
	}
	
	@Override
	public void applyBreak() {
		System.out.println("BMW--apply break");
		
	}
	
	// it can have his own methods

	public void autoParking() {
		System.out.println("BMW--auto parking");
		applyBreak(); // method chaining, calling one method inside another method
		stop();//calling from Car, inheritance
	}
	
	public void gpsTracking() {
		System.out.println("BMW--gps tracking");
	}
	
	
	
	//can we override grandparent method in child class?
	//Ans: Yes we can override grandparent properties in child class
	@Override
	public void engine() {
		System.out.println("BMW--engine");		
	}
	
	//access the method of Truck class
	//create Truck object & access the method
	//we are creating the object of Truck in the BMW class, this is not inheritance
	//Composition: If a particular class is having the object of other class & calling the methods of that class
	//HAS_A relationship
	
	//If BMW wants to access the methods of Audi, it has to create the object of Audi in his class to access Audi's methods, this is also called Composition
	
	public void bmwLoading() {
		DiamondProblem_Truck tr = new DiamondProblem_Truck(); //BMW class is having Truck class object & able to access its methods: Composition
		tr.heavyLoading(); //this is not inheritance
		
	}

}
