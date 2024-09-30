package javaBasicsPractice;

public class Car_Practice {
	
	String name;
	String color;
	double price;
	static final int wheels =4;
	

	public static void main(String[] args) {
		
		//static int i=10; //can't declare local variable as static
		
		Car_Practice c1 = new Car_Practice();
		c1.name="BMW";
		c1.color="Blue";
		c1.price=52.65;
		//c1.wheels=4;
		
		//we can modify the value of the wheels property, now wheels=5;
		//wheels=5;//can't reassign again since wheels is final
		
		Car_Practice c2 = new Car_Practice();
		c2.name="Audi";
		c2.color="Red";
		c2.price=72.33;
		//c2.wheels=4;
		
		Car_Practice c3 = new Car_Practice();
		c3.name="Toyota";
		c3.color="Green";
		c3.price=12;
		//c3.wheels=4;
		
		Car_Practice c4 = new Car_Practice();
		c4.name="Skoda";
		c4.color="Black";
		c4.price=13.89;
		//c4.wheels=4;

	}

}

//since wheels are common property to all the cars we can make it static
//we can modify the value of the static variable inside the method
//to resolve that, we should make it final(constant)
//once the variable is declared as final we can't change the value of it, will get error 'final field can't be assigned'
//local variable can't be static, only global variables can be static
//local variable can be final