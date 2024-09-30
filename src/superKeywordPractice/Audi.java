package superKeywordPractice;

public class Audi extends Car{
	
	//constructors
	public Audi() {
		//'super' in constructor calling
		//it has to be the first statement
		
		super(); //first statement in child class constructor
		System.out.println("Audi--default constructor");
	}
	
	public Audi(int a) {
		super(a); //calling parent class 1 parameter constructor
		System.out.println("Audi--1 parameter constructor");
	}
	
	
	public Audi(int a, int b) {
		super(a,b); //calling parent class 2 parameters constructor
		System.out.println("Audi--2 parameters constructor");
		super.start(); //calling parent class start() method
		Car.testing(); //calling static method of parent class
		System.out.println(super.speed); //parent speed=100
	}

}
