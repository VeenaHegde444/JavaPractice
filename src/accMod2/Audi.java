package accMod2;

import accessModifiers_1_Practice.Car;

public class Audi extends Car{

	public Audi(String name, String color, int price) {
		super(name, color, price);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
         Audi a = new Audi("Audi","White",5200000);
		
		//Car c = new Car();//protected const... can not be accessed from a differnt package parent class

	}

}
