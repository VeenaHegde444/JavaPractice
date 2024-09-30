package assignments;

public class Narrowing {

	public static void main(String[] args) {
		double doubleValue = 45.75;
		float floatValue = 30.5f;
		long longValue = 1000000000L;
		
		int intFromDouble = (int)doubleValue;//double to int
		short shortFromFloat = (short)floatValue;//float to short
		byte byteFromLong = (byte)longValue;//long to byte
		
		System.out.println("Original double value:"+doubleValue);
		System.out.println("Narrowed to int:"+intFromDouble);
		
		System.out.println("Original float value:"+floatValue);
		System.out.println("Narrowed to short:"+shortFromFloat);
		
		System.out.println("Original long value:"+longValue);
		System.out.println("Narrowed to byte:"+byteFromLong);

	}

}
