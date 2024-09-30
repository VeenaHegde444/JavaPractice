package javaBasicsPractice;

public class StringConcat_Practice1 {

	public static void main(String[] args) {
		String name = "Naveen";
		String num = "1000";
		
		String x = "Hello";
		String y = "Selenium";
		
		int a = 100;
		int b = 200;
		
		double c = 12.33;
		double d = 12.44;
		
//		System.out.println(a+b);//300
//		System.out.println(x+y);//HelloSelenium
//		System.out.println(x+a);//Hello100
//		System.out.println(a+b+x);//300Hello
//		System.out.println(a+b+x+y);//300HelloSelenium
//		
//		System.out.println(x+y+a+b);//HelloSelenium100200
//		System.out.println(x+y+(a+b));//HelloSelenium300
//
//		System.out.println(a+b+x+y+a+b);//300HelloSelenium100200
//		
//		System.out.println(a+b+x+y+(a+b+c+d));//300HelloSelenium324.77
//		
//		System.out.println(a+b+c+d+x+y);//324.77HelloSelenium
//		
//		System.out.println("the value of a " + a);//the value of a 100
//		System.out.println("the value of b " + b);//the value of b 200
//		System.out.println("the sum of a and b is : " + (a+b));//the sum of a and b is : 300
//		
//		
		char ch = 'a';
		String str = "Selenium";
	//	System.out.println(str + ch);//Seleniuma
		
		char c1 = 'a';
		char c2 = 'b';
//		System.out.println(c1);//a
//		System.out.println(c1+c2);//97+98, 195
//		System.out.println(c2-c1);//1
		
		//when we directly print the character it will print the value of it. If we concatenate the char 		
		//with another char then result will be in integer since ASCII values of those char will be taken into account
//		
//		//range: 
//		//a-z: 97 to 122
//		//A-Z: 65 to 90
//		//0-9: 48 to 57
//		
//		System.out.println('A' + 'B');//65+66=131
//		System.out.println(c1+c2+'0'+'A');//97+98+48+65 =308
//		System.out.println(str+c1+c2);//Seleniumab
//		System.out.println(str+(c1+c2));//Selenium195
//		
//		System.out.println(c1);//a
//		System.out.println((byte)c1);//97
//		System.out.println((byte)'$');//36
		
//		char ct = '*';
//		System.out.println((byte)ct);//42
//		
//		System.out.println('a'+0);//97
//		System.out.println('$'+0);//36
//		
//		System.out.println('a'+10+20-10);//97+10+20-10=117
//		
//		System.out.println("Naveen " + 'm');//Naveen m
//
		System.out.println('a'+'c'+'0'+'9'+'A'+"Hello"+'a'+'b');//97+99+48+57+65=366Helloab
		
		boolean flag = true;
		String u = "yes";
		System.out.println(flag + u);//trueyes
		
		System.out.println("a"+"b");//ab
		System.out.println('a'+'b');//97+98=195

		System.out.println(flag + ""+ 'a');//truea

	}

}
