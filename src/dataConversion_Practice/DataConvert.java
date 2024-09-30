package dataConversion_Practice;

import java.util.Arrays;

public class DataConvert {

	public static void main(String[] args) {
		//String to Integer conversion
		
		String x = "100";
		// we can't perform any operation on string, so we need to convert string to integer
		System.out.println(x+20);//10020, it concatenates 100 with 20
		
		int i = Integer.parseInt(x); //throws NumberFormatException
		//Integer - is a class
		//parseInt() is a method which returns int
		
		System.out.println(i+20);//120
		
		System.out.println(Integer.MIN_VALUE);// int range: 4 bytes-32 bits: -2^31 to 2^31-1
		System.out.println(Integer.MAX_VALUE);
		
		
		System.out.println(Byte.MIN_VALUE); // byte range: 8 bits: -128 to 127
		System.out.println(Byte.MAX_VALUE);
		

		
		String y = "100A"; // it is a alpha-numeric no
	//	int j = Integer.parseInt(y); //NumberFormatException, we can't convert alpha-numeric no, it has to be pure integer
	//	System.out.println(j+20);// doesn't execute
		
		int j = Integer.parseInt(y.replace("A", "")); //100
		System.out.println(j+20);//120
		
		
	//	String p ="a";
	//	System.out.println(Integer.parseInt(p));//NumberFormatException
		
		//using Interger.parseInt() we can convert only pure integer number i.e p="100";
		
		String totalPrice="1000";
		int price = Integer.parseInt(totalPrice);
		System.out.println(price-100);//900
		
		//String to double conversion
		String s = "100.33";
		System.out.println(s+20);//100.3320, concatenates s with 20
		double d = Double.parseDouble(s);//100.33
		System.out.println(d+20);//120.33
		
	/*	
		String str ="";
		int i1 = Integer.parseInt(str);
		System.out.println(i1);//NumberFormatException
		
		
		String str=null;
		int i1 = Integer.parseInt(str);
		System.out.println(i1);//NumberFormatException
    */
		
		String str="0";
		int i1 = Integer.parseInt(str);//0
		System.out.println(i1);//0
		
		String ing = null;
	//	System.out.println(Double.parseDouble(ing));
	//	System.out.println(Float.parseFloat(ing));
		
	//	System.out.println(Integer.parseInt(null));//NumberFormatException
	//	System.out.println(Double.parseDouble(null));//NullPointerException
	//	System.out.println(Short.parseShort(null));//NumberFormatException
	//	System.out.println(Long.parseLong(null));//NumberFormatException
	//	System.out.println(Float.parseFloat(null));//NullPointerException,
		//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.trim()" because "in" is null
	//	System.out.println(Byte.parseByte(null));//NumberFormatException
		System.out.println(Boolean.parseBoolean(null));// in case of string being null, it will return false
	//	System.out.println(Character.pa);
		
		
		
		
	//	Integer in = null;
	//	System.out.println(Integer.parseInt(in));
		
		//integer to string conversion
		
		int t =100;
		System.out.println(t+20);//120
		
		String e = String.valueOf(t);//"100"
		System.out.println(e+20);//10020, concatenates
		
		//double to String
		
		double marks = 200.33;
		String m1 = String.valueOf(marks);//"200.33"
		System.out.println(m1+20);//200.3320
		
	//	String.valueOf() is a overloaded method
		
		char ch ='A';
		String cs = String.valueOf(ch);//"A"
		System.out.println(cs+20);//A20
		
		//String to boolean
		
		String tr = "FALSE"; //works for True/true/TRUE & False/FALSE/false
		boolean flag = Boolean.parseBoolean(tr);
		System.out.println(flag);//false
		if(flag) {
			System.out.println("PASS");
		}
		
		else {
			System.out.println("FAIL");
		}
		
		
		//boolean to string
		
		boolean gr = true;
		String yr = String.valueOf(gr);//"true"
		System.out.println(yr+20);//true20
		
		//only for char array String.valueOf is will print the array values
		char cd[] = {'s','e','l','e','n','i','u','m'};
		String td = String.valueOf(cd);
		System.out.println(td);
		
/*		
		String ar[] = {"Java","Python","Ruby"};
		String arr = String.valueOf(ar);
		System.out.println(arr);//
		
*/		
		Integer v = 100;
		Integer v2 = 100;
		if(v == v2) {
			System.out.println("hi");
		}
		if(v.equals(v2)) {
			System.out.println("hello");	
		}
		
		System.out.println(v+20);//120
		int v1 = v.intValue();
		System.out.println(v1);//100
		
		
		//primitive data compare ==
		//non-primitive data compare .equals()
		
		
		//for the below string print only "java" in double quotes
		String rest = "I love java code";
		//output should be I love "java" code
		String rest1 = "I love \"java\" code";
		System.out.println(rest1);
		
		String msg = "Hello Good Morning Guys!";
		String msg1 = "Hello \"Good Morning\" Guys!";
		System.out.println(msg1);
		
		String xpath = "//input[@name=\"naveen\"]";
		System.out.println(xpath);
	
		
		
		
		String data = "Veena.Hegde.9856230145.Bengaluru.India";
	//	String info[] = data.split("."); // in case of split with '.'it will print empty array
		String info[] = data.split("\\.");// here we are telling consider . as a normal operator
		System.out.println(Arrays.toString(info));
	/*	
		String data1 = "Veena*Hegde*9856230145*Bengaluru*India";
		String info1[] = data1.split("\\*");
		System.out.println(info1);
	*/	
		
		//String 
		Integer u =100;//4 bytes
		System.out.println(u.byteValue());//100
		
		
		int uu =100;//4 bytes
		
		String p1 ="java";
		String p2 ="java";
		System.out.println(p1.compareTo(p2));//0
		//compareTo() : here comparison is based on the unicode value of each character in the string
		
		
		int l = 07; //08 is a octal number (0-7, it has to be in this range)
		System.out.println(l);
		
		//Octal to Decimal Converter
		//octal number to decimal number: base 8
		//053 = (0 × 8²) + (5 × 8¹) + (3 × 8⁰) = 43
		//07 = (0 × 8¹) + (7 × 8⁰) = 7
		//0777 = (0 × 8³) + (7 × 8²) + (7 × 8¹) + (7 × 8⁰) = 511
		
		System.out.println(Character.MAX_VALUE);//space, char takes 2 bytes-16 bits
		System.out.println(Character.MIN_VALUE);//space
	
		
		//System.out.println((int)Character.MAX_VALUE); //65535
		
		String data3 = "Namste! Hello & \"Good Morning\"" ;
		System.out.println(data3);
		
		
		
		
		
	}
	

}
