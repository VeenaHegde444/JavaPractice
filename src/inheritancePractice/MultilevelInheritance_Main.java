package inheritancePractice;

public class MultilevelInheritance_Main {

	public static void main(String[] args) {
		//create the object of BMW child class
		
		MultilevelInheritance_Child_BMW Bobj = new MultilevelInheritance_Child_BMW();
		
		//here BMW is overriding 2 methods from 'Car' class, so preference will be given to child class i.e 'BMW'
		
		Bobj.start(); //Overridden
		Bobj.applyBreak(); //Overridden
		
		// BMW is inheriting parent class 'Car' properties
		
		Bobj.stop();//Inherited from Car
		Bobj.refuel();//Inherited from Car
		
		//BMW has its own individual methods
		
		Bobj.autoParking(); //individual method of BMW
		Bobj.gpsTracking(); //individual method of BMW
		
		//BMW can access methods of 'Vehicle' class i.e grandparent to child
		
		Bobj.engine(); // method from grandparent Vehicle
		Bobj.cruiceControl(); //method from grandparent Vehicle
		
		//access instance/class variables
		//there is no concept of variables overriding, it is just individual class variables even though name is same.
		
		System.out.println("BMW speed: "+Bobj.speed); // preference will be given to 'BMW' class 
		
		//BMW can't access properties of 'Audi' class
		
		//calling bmwLoading class
		
		Bobj.bmwLoading(); //it is called composition, it will call heavyLoading() method of Truck.
		
		
		System.out.println("***********************************");
		
		//create the object of 'Audi' class
		
		MultilevelInheritance_Child_Audi Aobj = new MultilevelInheritance_Child_Audi();
		
		// here Audi is overriding 1 method of 'Car' class
		
		Aobj.start(); //Overriding
		
		//Audi is inheriting parent 'Car' properties
		
		Aobj.stop(); //Inherited from Car
		Aobj.applyBreak(); //Inherited from Car
		Aobj.refuel(); //Inherited from Car
		
		//Audi has its own individual methods
		
		Aobj.speedTracking(); //Individual method of Audi
		Aobj.theftSafety(); //Individual method of Audi
		
		//Audi can access properties of 'Vehicle' i.e grandparent class
		
		Aobj.engine(); // Inherited from grandParent Vehicle
		Aobj.cruiceControl();// Inherited from grandParent Vehicle
		
		//class variable
		System.out.println("Audi speed: "+Aobj.speed); // Audi has its own speed variable
		
		//Audi can't access methods of 'BMW' class
		
		//Car class can't access methods of 'BMW' & 'Audi'
		
		//Vehicle class can't access methods of 'Car','BMW','Audi'
		
		
		System.out.println("*********************************************");
		
		//Top/Up Casting:
		//child class object can be referred by parent class reference variable
		//with top casting we can access all the overridden & inherited methods only
		//but can't access individual methods - reference type check will be applied & it will fail
		
		MultilevelInheritance_Parent_Car obj = new MultilevelInheritance_Child_BMW(); //IS_A relationship
		
		//every BMW is also a Car
		
		obj.start(); // here BMW start method will be called, preference will be given to child, start() method is overridden in BMW
		obj.stop(); // from Car
		obj.refuel(); //from Car

		
		//we can't access autoParking() method of BMW class, concept will be called as 'reference type check' , 
		//it will be failed since it is a individual method of 'BMW'
		
		//Down Casting: 
		//parent class object can be referred by child class reference variable
		//Down casting is not supported in java
		
		MultilevelInheritance_Child_BMW obj1 = (MultilevelInheritance_Child_BMW)new MultilevelInheritance_Parent_Car();
		
		//every car is not BMW, so we need to do casting otherwise it will show an compile time error
		//At the run time we will get 'ClassCastException' error
		
		
		MultilevelInheritance_Parent_Car obj2 = new MultilevelInheritance_Child_Audi();
		obj2.start(); // 
		obj2.stop();
		obj2.refuel();
		
		//we can't access theftSafety() & speedTracking() methods of Audi
		//reference type check concept will be failed, since these are individual methods of Audi
		
		//Top Casting with grandparents
		//child class object will be referred by grand parent class reference variable
		//it is allowed
		
		MultilevelInheritance_GrandParent_Vehicle obj3 = new MultilevelInheritance_Child_BMW(); //IS_A relationship
		
		//every BMW is also a vehicle
		//we can access only Vehicle class methods
		//grand parent can't access anything from the child
		//it can access only overridden & inherited methods
		
		obj3.engine();
		obj3.cruiceControl();
		
		

	}

}
