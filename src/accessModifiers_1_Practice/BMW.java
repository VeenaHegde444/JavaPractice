package accessModifiers_1_Practice;

public class BMW extends Car{
	

	public static void main(String[] args) {
		
		//same package, subclass
		
		//accessing parent class variables : we can access default,protected & public variables
		
		BMW b = new BMW();
		System.out.println(b.name);
		System.out.println(b.price);
		System.out.println(b.color);
		
		
		//accessing parent class methods : we can access default,protected & public methods
		b.getName();
		b.getPrice();
		b.getColor();
		
		//accessing parent class constructors : we can access default, protected & public constructors
		
		Car c1 = new Car();//default
		Car c2 = new Car("Red",4500000);//protected
		Car c3 = new Car("BMW-X1","White",7500000);//public
		

		
	}
	
	

}
