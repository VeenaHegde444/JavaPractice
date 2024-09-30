package javaBasicsPractice;

public class StringConcat_Practice {

	public static void main(String[] args) {
		String str1 = "Good";
		String str2 = "Morning";
		
		int a = 100;
		int b = 150;
		float c = 14.23f;
		double d = 150.890;
		char ch ='a';
		
		int x=10,y=20,z=30;
		
//		System.out.println(x+y+z);//60
//		System.out.println(x*y+z);//230
//		System.out.println(x+y*z);//610
//
//		System.out.println(str1+str2);//GoodMorning
//		System.out.println(a+b);//250
//		System.out.println(str1+a);//Good100
//		System.out.println(a+str1);//100Good
//		System.out.println(str1+a+str2+b);//Good100Morning150
//		System.out.println(" "+ " !");// !
//		System.out.println(" "+str1); // Good
//		
//		System.out.println(c+d);//165.119
//		System.out.println(str1+c+str2+d);//Good14.23Morning150.89
//		
//		System.out.println(str1+ch);//Gooda
//		System.out.println('a'+str1+ch);//aGooda
//		
//		System.out.println(a+b+str1+"!"+str2);//250Good!Morning
//		System.out.println(str1+a+b+"!"+str2+ch+d);//Good100150!Morninga150.89
//		
//		System.out.println((a+b)*(c+d)+str1+str2);//250*165.12 = 41279.99988555908GoodMorning
		
		System.out.println(ch);//a
		System.out.println(str1+ch);//Gooda
		System.out.println(ch+str1);//aGood
		
		char c1 = 'a';
		char c2 = 'b';
		
		System.out.println(c1);//a
		System.out.println(c1+c2);//97+98 =195
		System.out.println(c2-c1);//1
		System.out.println(c2);//b
		
	}

}
