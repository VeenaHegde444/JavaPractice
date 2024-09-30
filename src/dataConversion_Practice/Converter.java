package dataConversion_Practice;

public class Converter {
	
	private static Integer toInteger(String string, Integer defaultValue) {
		try {
			return string == null ? defaultValue : Integer.parseInt(string);
		}
		catch(NumberFormatException e) {
		return defaultValue;
		}
	}

	public static void main(String[] args) {
		System.out.println(toInteger(null,null));

	}

}
