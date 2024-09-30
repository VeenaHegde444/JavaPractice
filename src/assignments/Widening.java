package assignments;

public class Widening {

	public static void main(String[] args) {
		
		int intValue = 10;
		float floatValue = 20.5f;
		double doubleValue = 30.75;
		
		double doubleFromInt = intValue;//int to double
		double doubleFromFloat = floatValue;//float to double
		
		System.out.println("Original int value:"+intValue);
		System.out.println("Widened to double:"+doubleFromInt);
		System.out.println("Original float value:"+floatValue);
		System.out.println("Widened to double:"+doubleFromFloat);

	}

}
