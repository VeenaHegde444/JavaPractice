package inheritance;

class BMW_Practice extends Car{ //child class extends parent class
	
	//can inherit all the fields & methods of parent class
	//also child class can have its own fields & methods
	
	
	//bmw can have a same method name which is in parent class
	//Method Overriding: when we have a method in parent class & exact same method in child class
	//1.with the same name
	//2.with the same no. of parameters
	//3.with the same sequence of parameters
	//4.business logic/no. of lines in the method doesn't matter
	//5.return type of the method should be same
	
	
	//class variable
	
	int speed = 200;
	
	@Override // to indicate this method is overrided
	public void start() { // same as parent class method, left side triangle symbol to tell it is overrided
		System.out.println("bmw -- start");
	}
	public void autoParking() {
		System.out.println("bmw -- autoparking");
	}
	
	
	//private method from parent class can't be inherited
/*	private void getInfo() {
		
	}
	
	
*/
	
	public void speedTracking() {
		System.out.println("bmw--speed tracking");
	}




	
}
