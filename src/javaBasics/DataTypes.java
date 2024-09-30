package javaBasics;

public class DataTypes {

	public static void main(String[] args) {
		/*Notes:
		 * 1. primitive data types: all are reserved data types
		
		        Numeric Type:
	                Integral Value:
	                    Integer: byte,short,int,long
	                    Float:float,double
	                Character Value: char ; $,a,1
	            Boolean type: true/false
		
		  2.non-primitive data types: class, interface,arrays,object,String

		
		
		1.byte 
		 size: 1 byte = 8 bits
		 range:  -128 to 127 (-2^7 to 2^7-1)
		
		2.short
		 size: 2 bytes = 16 bits
		 range: -32768 to 32767 (-2^15 to 2^15-1)
				

		3.int
		 size: 4 bytes = 32 bits
		 range: -2147483648 to 2147483647 (-2^31 to 2^31-1)
		
		
		4.long
		 size: 8 bytes = 64 bits
		 range: -2^63 to 2^63-1
			//309
		
		5.float
		 size: 4 bytes = 32 bits
		 range: after . it can take up to 6-7 decimal digits
		
		//before dot(.) we can add 39 numbers
		 
		6.double
		 size : 8 bytes = 64 bits
		 it can take up to 15 decimal digits
		
		
		7.char : 1 digit value : unicode values + ASCII values
		 size: 2 bytes = 16 bits
		 
		
		8.boolean :true/false
		 size: ~1 bit
		 range : true/false
		 * 
		 * 
		 */
		
		long l = 16985452L;
		System.out.println(l);
		
		float f = 14.52f;
		System.out.println(f);
		
		float ff = 340282350000000000000000000000000000000f;//39
		System.out.println(ff);
		
		//309
		double dd = 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000d;
		System.out.println(dd);
		
        char ch = 'a';
		
		System.out.println('t'+10);//unicode value for 't' is 116,  116+10 = 126
		
	//	't' + 10 is evaluated using integer arithmetic because'char' type in java is an integer type representing a Unicode character.
		
		double a = 0.1;
		double b = 0.2;
		
		double sum = a + b;
		System.out.println(sum);
		
		float c = 0.1f;
		float d = 0.2f;
		float e = c + d;
		System.out.println(e);
	
		// mobile no, SSN, Aadhar Number, Account Number we will store it in String
		
	}

}
