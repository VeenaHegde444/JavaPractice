package inheritancePractice;
/*Multilevel Inheritance:
 * In multilevel inheritance, a child class will be inheriting a parent class, & and child class also acts as the base for other classes.
 * Ex:  A(Parent Class) >> B (Child Class) >> Child Class
 * Here, B class acts as a child to A as well as a Parent to C class.
 * In Java, a class can't directly access the grandparent's class members.
 * 
 * Vehicle(grand parent) >> Car (parent) >> BMW, Audi (childs)
 * 'Vehicle' can't access properties of 'Car' class i.e a parent can't access the properties of child class
 */
public class MultilevelInheritance_GrandParent_Vehicle {
	
	int speed = 100;
	
	public void engine() {
		System.out.println("vehicle--engine");
	}
	
	public void cruiceControl() {
		System.out.println("vehicle--cruice control");
	}
	
	
	

}
