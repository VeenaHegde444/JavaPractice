package accessModifiers_1_Practice;

public class Cycle {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		//same package, non-subclass
		
		//accessing variables:  we can access default,protected & public variables
		
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.color);
		
		//accessing methods: we can access default,protected & public methods
		
		c.getName();
		c.getPrice();
		c.getColor();
		
		//accessing constructors: we can access default, protected & public constructors
		
		
		Car c1 = new Car();
		Car c2 = new Car("Red",4500000);
		Car c3 = new Car("BMW-X2","Green",85000000);

	}

}
