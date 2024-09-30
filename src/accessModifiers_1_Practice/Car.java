package accessModifiers_1_Practice;

public class Car {
	
	//instance variables
	
	String name;
	public int price;
	protected String color;
	private String chasisNumber;
	
	
	//methods
	
	//default method
	
	void getName() {
		System.out.println("Car--name ");
	}
	
	//public method
	public void getPrice() {
		System.out.println("Car--price");
	}
	
	
	//protected method
	
	protected void getColor() {
		System.out.println("Car--color");
	}
	
	//private method
	private void getChasis() {
		System.out.println("Car--chasis");
	}
	
	
	//constructors
	
	//default constructor
	
	Car(){
		System.out.println("calling Car default constructor");
	}
	
	//private constructor
	private Car(String name, int price, String color, String chasisNumber){
		System.out.println("calling Car private constructor");
		this.name=name;
		this.price=price;
		this.color=color;
		this.chasisNumber=chasisNumber;
	}
	
	//protected constructor
	
	protected Car(String color,int price) {
		System.out.println("calling Car protected constructor");
		this.color=color;
		this.price=price;
	}
	
	//public constructor
	
	public Car(String name, String color,int price) {
		System.out.println("calling Car public constructor");
		this.name=name;
		this.color=color;
		this.price=price;
	}
	
	public static void main(String[] args) {
		//create the Car object
		
		Car c = new Car();
		
		//in the same class we can access all variables (default,private,protected,public)
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.color);
		System.out.println(c.chasisNumber);
		
		//in the same class we can access all methods (default,private,protected,public)
		c.getName();
		c.getPrice();
		c.getColor();
		c.getChasis();
		
		
		//within the same class we can access all constructors (default,private,protected,public)
		Car c1 = new Car(); //default constructor
		
		Car c2 = new Car("BMW",250000,"Red","1000020"); //private constructor
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+c2.chasisNumber);
		
		Car c3 = new Car("Red",250000); //protected constructor
		System.out.println(c3.color+" "+c3.price);
		
		Car c4 = new Car("Audi","White",500000); //public constructor
		System.out.println(c4.name+" "+c4.price+" "+c4.color);
	
		
	}

}
