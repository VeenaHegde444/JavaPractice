package practice_06072024;
/* JVM- Java Virtual Machine : converts byte code to machine code
 * JVM is platform dependent.
 * JVM is a virtual machine that executes java code & provides runtime environment for java applications.
 * 
 * Java is not 100% object oriented because it supports primitive data types like int,char,long,byte,double etc.
 * 
 * JRE-Java Runtime Environment : to run java programs
 * JRE is a set of tools & libraries that allow java applications to run on a computer.
 * 
 * JDK-Java Development Kit: it consists of Tools, Compiler, Debugging, java docs, libraries
 * JDK helps in the design & execution of code.
 * 
 * 
 * .java file(source code file) >> compiled into java bytecode (.class file) using javac(java compiler).
 * The byte code is a platform independent code that can be executed on any system with a JVM.
 * 
 * 1.Java compiler converts  .java to .class bytecode.
 * 2.JVM runs .class bytecode using JRE.
 * 3.JRE provides runtime environment & class libraries for java programs.
 * 4.JVM is platform dependent.
 * 
 */
public class JavaBasics {

	public static void main(String[] args) {
		//primitive data types: byte,short,int,long,float,double,char,boolean
		
		//any integer divide by zero : ArithmeticException
		
	//	int i = 9/0; //ArithmeticException
		
		//System.out.println(0/0); //ArithmeticException
		
		//0 divide by any integer : 0
		int j = 0/9;
		System.out.println(j);//0
		
		
		//integer divide by float 0.0 or float divide by integer 0 : Infinity
		int k = 10;	
		float f = 2.2f;
		System.out.println(k/0.0); //Infinity
		System.out.println(f/0); //Infinity
		
		//int 0 divided by float 0.0, or float 0.0 divided by int 0 : NaN-Not a Number
		
		System.out.println(0.0/0);//NaN
		System.out.println(0/0.0);//NaN
		
		//type casting : byte >> short >> char >> int >> long >> float >> double
		//widening: converting from lower data type to higher data type, automatic conversion
		byte b = 42;
		System.out.println(b);
		short sh = b; //automatic conversion from byte to short
		System.out.println(sh);
		int i = sh; //automatic conversion from short to int
		System.out.println(i);
		long l =i; //automatic conversion from int to long
		System.out.println(l);
		
		float f1 = l; //automatic conversion from long to float
		System.out.println(f1);
		double l1 = f1; //automatic conversion from float to double
		System.out.println(l1);
		
		
		
		//narrowing: converting from higher data type to lower data type, explicit casting
		
		double d = 42.0;
		System.out.println(d);
		float f2 = (float)d;//explicit cast from double to float
		System.out.println(f2);
		long l2 =(long) f2; //explicit cast from float to long
		System.out.println(l2);
		int i2 =(int) l2; //explicit cast from long to int
		System.out.println(i2);
		short s2 = (short)i2;//explicit cast from int to short
		System.out.println(s2);
		byte b2 = (byte)s2; //explicit cast from short to byte
		System.out.println(b2);

		char ch = 'A';
		int i3 = ch;// automatic conversion
		System.out.println(i3);//65
		
		
		//string concatenation
		int x=10,y=20,z=30;
		
	}

}
