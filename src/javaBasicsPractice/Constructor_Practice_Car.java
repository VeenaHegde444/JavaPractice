package javaBasicsPractice;

public class Constructor_Practice_Car {
	
	String name;
	String color;
	String model;
	int year;
	int airBags;
	
	//default constructor
	
	public Constructor_Practice_Car() {
		this.name="Null";
		this.color="Null";
		this.model="Null";
		this.year=0;
		this.airBags=0;
	}
	
	//parameterized constructor
	public Constructor_Practice_Car(String name, String color,String model,int year,int airBags) {
		this.name=name;
		this.color=color;
		this.model=model;
		this.year=year;
		this.airBags=airBags;
	}
	

	public static void main(String[] args) {
		Constructor_Practice_Car obj = new Constructor_Practice_Car();
		System.out.println(obj.name+" "+obj.color+" "+obj.model+" "+obj.year+" "+obj.airBags);
		
		Constructor_Practice_Car obj1 = new Constructor_Practice_Car("BMW","Red","BMWY24",2024,6);
		System.out.println(obj1.name+" "+obj1.color+" "+obj1.model+" " +obj1.year+" "+obj1.airBags);

	}

}
