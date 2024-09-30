package constructorAssignments;
/*Create a Java class named "Car" with the following instance variables:

make (String)

model (String)

year (int)

Create a constructor for the Car class that takes in the make, model, and year as parameters and initializes the instance variables.

Create a default constructor for the Car class that sets the make, model, and year to "Unknown".

Create a main method that creates three instances of the Car class using both constructors and prints out their information.
 * 
 * 
 */
public class Car {
	
	//instance variables
	
	String make;
	String model;
	int year;
	
	//default constructor
	
	public Car() {
		this.make="Unknown";
		this.model="Unknown";
		this.year=-1; //assuming -1 indicates unknown year
	}
	
	
	public Car(String make, String model, int year) {
		this.make=make;
		this.model=model;
		this.year=year;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	

}
