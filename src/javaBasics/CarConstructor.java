package javaBasics;

public class CarConstructor {
	
	String name;
	String color;
	double price;
	String model;
	String chasisNumber;
	
	//java will not add any hidden(default) const...

	public CarConstructor(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public CarConstructor(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public CarConstructor(String name, String color, double price, String model) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
	}

	public CarConstructor(String name, String color, double price, String model, String chasisNumber) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}

	public static void main(String[] args) {
		CarConstructor c1 = new CarConstructor("BMW", 50.44);
		CarConstructor c2 = new CarConstructor("BMW", "Red", 80.44, "x3");
		CarConstructor c3 = new CarConstructor("Audi", "Green", 75.44, "q3", "12121wewew");
		
		
		System.out.println(c1.name + " " + c1.price + " " + c1.model + " " + c1.chasisNumber + " " + c1.color);
		System.out.println(c2.name + " " + c2.price + " " + c2.model + " " + c2.chasisNumber + " " + c2.color);
		System.out.println(c3.name + " " + c3.price + " " + c3.model + " " + c3.chasisNumber + " " + c3.color);
	}

}
