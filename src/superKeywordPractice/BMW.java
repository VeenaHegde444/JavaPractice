package superKeywordPractice;
/*'super': 
 * It is used to access parent class instance variables & static methods.
 * It is used to access parent class methods & constructors.
 * It should be the first statement in the constructor.
 * 
 * 
 */
public class BMW extends Car{
	
	//int speed = 300;
	
	@Override
	public void start() {
		//1. if we just use 'start()' it will call the current class start() method
		
		//start(); // this will lead to recursion, StackOverFlow error, since child class start() method is calling itself
		
		
		//2.to call parent class start() method, use 'super.'
		
		super.start(); // this will call parent class method 
		System.out.println("BMW--start");
		
	    }
		//individual methods
		
		public void autoParking() {
			System.out.println("BMW--auto parking");
			//inside the method, 'super' doesn't have to be the first call, we can call it anywhere
			
			start(); // will call the child class start() method
			super.start(); //this will call the parent class start() method
	
		}
		
		public void displaySpeed() {
			System.out.println("BMW--display speed");
			System.out.println("Speed is:"+speed); // BMW speed=300
			System.out.println("Speed of Car is:"+super.speed);  //Car speed=100
			//when Car & BMW doesn't have speed property, then it will look for grand parent & prints the value
			//'super' is used to access immediate parent properties
			System.out.println(super.speed);
		}
		
		
		
		
		
	
	

}
