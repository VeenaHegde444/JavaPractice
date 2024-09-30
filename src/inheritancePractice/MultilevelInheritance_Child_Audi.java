package inheritancePractice;
/*
 * Here one child can't access properties of another child even though they share a same parent
 * 
 */

public class MultilevelInheritance_Child_Audi extends MultilevelInheritance_Parent_Car{
	
	int speed = 600;
	
	@Override
	public void start() {
		System.out.println("Audi--start");
	}
	
	//Audi has its own methods
	
	public void theftSafety() {
		System.out.println("Audi--theft safety");
	}
	
	public void speedTracking() {
		System.out.println("Audi--speed tracking");
	}

}
