package superKeywordPractice;

public class CarMain {

	public static void main(String[] args) {
	/*	BMW bm = new BMW();
		bm.start();
		// when it goes to line no. 12 of BMW class,it will not go inside since it has a parent class
		//first it will execute the parent's default constructor,since default constructor is mandatory in parent class
		//then at line no. 20, it will go to parent class start() method & prints
		//then it will execute line no. 21 of BMW's start() method
		
		bm.refuel();// inherited, Car class refuel() method will be called
		
		bm.autoParking(); //individual method of BMW
		bm.displaySpeed(); //individual method of BMW
		
	*/	
		//create object of Audi
		
	//	Audi au = new Audi(10,20);
		//1. when no arguments passed in the constructor
		
		//first it will call the default constructor, 
		//then calls Audi default constructor
		
		//2. when 1 argument passed in the constructor
		//first it will call default constructor of parent class constructor, 
		//then it calls child class 1 parameter constructor
		
		//3.when 2 arguments passed in the constructor
		//first it will call default constructor of parent class constructor, 
		//then it calls child class 1 parameter constructor
		
		//create object of Honda
		
		Honda h = new Honda();
		
		
		

	}

}

