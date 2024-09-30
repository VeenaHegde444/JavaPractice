package superKeywordPractice;

public class Car  extends Vehicle{
	//instance variable
	int speed=100;
	
	//constructors
	public Car() {
		System.out.println("Car--default constructor");
	}
	
	public Car(int a) {
		System.out.println("Car--1 parameter constructor");
	}
	
	public Car(int a, int b) {
		System.out.println("Car--2 parameters constructor");
	}
	
	//non-static methods
	
	public void refuel() {
		System.out.println("car--refuel");
	}
	
	public void start() {
		System.out.println("car--start");
	}
	
	//static method
	
	public static void testing() {
		System.out.println("car--testing");
	}

}
