package inheritance;

class Car_Practice_Main {

	public static void main(String[] args) {
		//create object of child class i.e BMW_Pracice
		//when we create the object of child class, it will inherit all the fields & methods of parent class
		
		BMW_Practice Bobj = new BMW_Practice();
		Bobj.start(); // here parent & child have the same class name, so preference will be given to child class
		Bobj.stop(); // inherited from Car
		Bobj.refuel(); // inherited from Car
		Bobj.applyBreak(); // inherited from Car
		Bobj.autoParking();// BMW's own method
		
		Bobj.getInfo(); // we can print the final method of parent class but we can't override it
		
		System.out.println("BMW speed is:"+Bobj.speed); //200, preference will be given to child class variable
		
		//can we access private method?
		//Yes, we can access the private method, but it can't be overridden
		
		Bobj.getInfo();//private method of parent class
	

	}

}
