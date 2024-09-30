package inheritancePractice;

/*here Car can inherit all properties from his parent 'MultilevelInheritance_GrandParent_Vehicle' 

Car has his own class variables & methods
*/
public class MultilevelInheritance_Parent_Car extends MultilevelInheritance_GrandParent_Vehicle {
	
	int speed = 200;
	
	public void start() {
		System.out.println("car--start");
	}
	
	public void stop() {
		System.out.println("car--stop");
	}
	
	public void applyBreak() {
		System.out.println("car--apply break");
	}
	
	public void refuel() {
		System.out.println("car--refuel");
	}


}
