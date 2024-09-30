package abstractClassPractice;

public class Rectangle extends Shape{
	
	private double width;
	private double height;
	
	//constructor
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
