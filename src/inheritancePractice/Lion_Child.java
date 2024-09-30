package inheritancePractice;

public class Lion_Child extends Animal_Parent{ 
	// when Lion(child) extends Animal(parent) it can inherit all the public instance/class variables & methods of parent class
	
	//class variable of Lion
	
	int a = 200;
	
	//Lion is overriding few methods of Animal & has its own methods
	
	@Override
	public void makeNoise() {
		System.out.println("Lion--make noise");
	}
	
	@Override
	public void eat() {
		System.out.println("Lion--eats");		
	}
	
	//individual method
	public void roar() {
		System.out.println("Lion--roar");
	}

}
