package assignments;
//3.Write a program to print the circumference and area of a circle of radius entered by user by defining your own method. 
public class MethodAssignment_03 {
	
	//formula for circumference of the circle
	//C=2PIr 
	// C-circumference, PI-the constant PI,  r-radius of the circle
	
	public static double calculateCircumference(double radius) {
		return 2 * Math.PI * radius;		
	}
	
	//formula for area of the circle
	//A=PIr^2
	//A-area, PI-constant value, r-radius
	
	public static double calculateArea(double radius) {
		return Math.PI*radius*radius;
	}

	public static void main(String[] args) {
		System.out.println(calculateCircumference(2));
		System.out.println(calculateArea(2));
	}

}
