package javaBasicsPractice;

public class TypeCasting_Practice {

	public static void main(String[] args) {
		
		//byte,short,char,int,long,float,double
		byte b = 10;
		
		//widening: converting lower data type to higher data type : automatic conversion
//		short s = b;
//		System.out.println(s);
//		int i =s;
//		System.out.println(i);
//		long l = i;
//		System.out.println(l);
//		float f = l;
//		System.out.println(f);
//		double d = f;
//		System.out.println(d);
		
		//narrowing: converting higher data type to lower data type: explicit conversion
		
		double d1 = 164876952.0;
		float f1 = (float)d1;
		System.out.println(f1);
		long l1 =(long)f1;
		System.out.println(l1);
		int i1 = (int)l1;
		System.out.println(i1);
		short s1= (short)i1;
		System.out.println(s1);
		byte b1 = (byte)s1;
		System.out.println(b1);
		
		//char to int
		char ch = 'a';
		char ch1 = 'A';
		int i2 =(int)ch;
		System.out.println(i2);//char to int is widening since char is a 16-bit & int is 32-bit
		
		int i3 =(int)ch1;
		System.out.println(i3);
		
		
		

	}

}
