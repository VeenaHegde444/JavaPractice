package abstractClassPractice;

public class MainMethod {

	public static void main(String[] args) {
		//create object of child classes
		
		Circle circle = new Circle(5);
		System.out.println(circle.getArea());
		
		Rectangle rectangle = new Rectangle(10,20);
		System.out.println(rectangle.getArea());

	}

}
