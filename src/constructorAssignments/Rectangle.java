package constructorAssignments;
/*Create a Java class named "Rectangle" with the following instance variables:

length (double)

width (double)

Create a default constructor for the Rectangle class that sets both the length and width to 0.0.

Create a constructor for the Rectangle class that takes in the length and width as parameters and initializes the instance variables.

Create a method in the Rectangle class named "calculateArea" that returns the area of the rectangle (length * width).

Create a main method that creates two instances of the Rectangle class using both constructors, calculates and prints out their respective areas.
 * 
 */
public class Rectangle {
	
	double length;
	double width;
	
	//default constructor
	public Rectangle() {
		this.length=0.0;
		this.width=0.0;
		
	}
	
	//parameterized constructor
	
	public Rectangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	
	//method to calculate area
	
	public double calculateArea() {
		return length*width;
	}

}
