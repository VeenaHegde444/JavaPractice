package inheritance;

class Car_Practice {
	//class variables
	
	int speed=100;	
	private int a=50;
	
	
	//private constructor
	
	private Car_Practice() {
		
	}
	public void start() {
		System.out.println("car--start");
	}
	
	public void stop() {
		System.out.println("car--stop");
	}
	
	public void refuel() {
		System.out.println("car--refuel");
	}
	
	public void applyBreak() {
		System.out.println("car--apply break");
	}
	
	//private method
	private void getInfo() {
		System.out.println("car--get info");
		System.out.println(a);
	}
	

}


//mouse hover >> press control >> will go to that method