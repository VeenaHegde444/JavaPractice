package inheritancePractice;

public class SingleInheritance_Main {

	public static void main(String[] args) {
		//create object of Lion i.e child class
		
		Lion_Child li = new Lion_Child();
		//now Lion class can access all public methods & instance variables of Animal class
		
		li.makeNoise(); //Overridden, Lion class method will get the preference
		li.eat();//Overridden, Lion class method will get the preference
		li.sleep();//Inherited
		li.roam();//Inherited
		System.out.println(li.a); //Lion class variable will get the preference
		
		//can access its own individual methods
		
		li.roar();//Individual method of Lion class
		

	}

}
