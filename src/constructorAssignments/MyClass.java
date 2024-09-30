package constructorAssignments;

public class MyClass {
	
	private int value;
	
	//constructor with parameter calling another constructor
	
	public MyClass(int value) {
		//calling another constructor within the same class
		this();
		setValue(value); //calling a method to set the value
	}
	
	//no-argument constructor
	public MyClass() {
		System.out.println("No-argument constructor called");
	}

	//method to set the value
	
	public void setValue(int value) {
		this.value=value;
	}
	
	//method to get the value
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// Creating an instance using the constructor that calls another constructor and method
		MyClass obj1 = new MyClass(10);
		System.out.println("Value: "+obj1.getValue());
		
		
		//creating an instance with no-argument constructor
		MyClass obj2 = new MyClass();
		obj2.setValue(20);//calling a method to set the value
		System.out.println("Value: "+obj2.getValue());
	}
	
}
