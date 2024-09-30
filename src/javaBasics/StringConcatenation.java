package javaBasics;

public class StringConcatenation {

	public static void main(String[] args) {
		// String is a class: default class
		
		char c1 = 'a';
		char c2 = 'b';
		int c3 =c1+c2;
		System.out.println(c1+c2);//97+98=195
		
		//ASCII range:
		//a-z: 97-122
		//A-Z:65 to 90
		//0-9 : 48-57
		
		//To get the ASCII value
		System.out.println((byte)c1);//97
		System.out.println((byte)'$');
		
		//another way of printing ASCII value
		System.out.println('a'+0);//97
		System.out.println('$'+0);//36
		
		System.out.println('a'+10+20-10);//97+10+20-10=117
		System.out.println(("Naveen " +'a'));
		
		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+'b');//97+99+48+57+65+Helloab=366Helloab
		System.out.println("a"+"b");//ab
		
		
		
		
	}

}
