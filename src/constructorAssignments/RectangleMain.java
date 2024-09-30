package constructorAssignments;

public class RectangleMain {

	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		System.out.println("Area of the rectangle: "+obj.calculateArea());
		
		Rectangle obj1 = new Rectangle(10,10);
		System.out.println("Area of the rectangle: "+obj1.calculateArea());

	}

}
