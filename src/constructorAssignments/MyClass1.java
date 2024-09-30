package constructorAssignments;

//class with a constructor that calls a non-static method from another class
public class MyClass1 {
	
	private int value;
	
	//constructor
	public MyClass1() {
		//creating an instance of Helper to call its method
		
		Helper helper = new Helper();
		
		//calling non-static method from another class to get initialization data
		
		this.value=helper.getInitialValue();
		
	}
	
	public int getValue() {
		return value;
	}

}
