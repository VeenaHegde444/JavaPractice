package stringManipulations_Practice;

import java.util.Arrays;

/* String is a sequence of characters.
 * Strings are type of objects that can store character of values
 * It acts as an array of characters in java.
 * It stores character values in an array.
 * lowest index is - 0
 * highest index - str.length -1
 * 
 * 
 * 
 */
public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "hi this is my java code and i am so happy i really am";
		
		//to get the length of the string
		System.out.println(str.length());
		
		//str.lenth() will give integer, so we can store it in int
		
		int len = str.length();
		
		System.out.println("Lowest index = "+0); //0
		System.out.println("Highest index = " +(str.length()-1)); //40
		
		//charAt(): returns the character value at the specified index
		
		//index will starts from 'zero'
		System.out.println(str.charAt(0)); //h
		System.out.println(str.charAt(2)); //space
		System.out.println(str.charAt(40)); //y
		
		//if we try to access the index more than the mentioned length we will get SIOB, this is while we are checking at charAt()
		//System.out.println(str.charAt(41)); //SIOB-StringIndexOutofBoundsException
		
		//if we go in the negative direction, we will get SIOB, in java there is no negative indexing
		//System.out.println(str.charAt(-1));
		
		//indexOf(): returns the index within this string of the first occurrence
		
		System.out.println(str.indexOf('h'));//0, it will give the first occurrence
		
		//1.find the 1st occurrence of 'i'
		System.out.println(str.indexOf('i'));//1
		
		//2.find the 2nd occurrence of 'i'
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); //5
		
		//we can store the 2nd occurrence of 'i' in integer
		int p1 = str.indexOf('i', str.indexOf('i')+1);
		System.out.println(p1);
		
		//3.find the 3rd occurrence of 'i'
		System.out.println(str.indexOf('i',p1+1));//8
		System.out.println(str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1));
		
		//4.find the 4th occurrence of 'i'
		//store the 3rd occurrence in a variable
		int p2 = str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1);
		System.out.println(p2);
		System.out.println(str.indexOf('i',p2+1));//28
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1));//28
		
		//find the 5th occurrence of 'i'
		//store the 4th occurrence in a variable
		int p3 =str.indexOf('i',str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1);
		System.out.println(p3);
		System.out.println(str.indexOf('i',p3+1));//42
		System.out.println(str.indexOf('i',str.indexOf('i',str.indexOf('i',str.indexOf('i', str.indexOf('i')+1)+1)+1)+1));//42
		
		System.out.println(str.indexOf("java")); // 14, it works for substring also
		
		// when it can't find a word or character in a given string, then it will print -1
		System.out.println(str.indexOf("python"));//-1,
		System.out.println(str.indexOf("z"));//-1

		//if we want to check a particular string is available in the web page after the login
		//want to check admin is present in the given string , it should display after welcome
		String msg = "welcome admin";
		
	//	if(msg.indexOf("admin") >= 0) {//this will print PASS even if msg = 'admin welcome'
		if(msg.indexOf("admin") == 8) {	//checking here whether 'admin' is at a particular position considering 'welcome' constant
		//we should not use contains() method here, because it will check whether the string is present or not, it won't check at which index it is present
			//we should not use >= 0 also because if admin is coming at the beginning test case will be PASS, but actually a bug
			//ex: account url will be at a specific location always, it can't come in between
			//checking API endpoint for ex.
			System.out.println("admin is present--PASS"); 			
		}
		else {
			System.out.println("admin is not present --FAIL");// welcomeadmin (no space between welcome & admin)
		}
		
		
		//find the string 'Sun Microsystems' is present in the given string or not,
		//not required to find at the given index
		String m1 = "Developed by Sun Microsystems in 1995, Java is a highly popular, object-oriented programming language."
				+ " This platform independent programming language is utilized for Android development, web development, artificial intelligence, "
				+ "cloud applications, and much more.";
		
		
		if(m1.indexOf("Sun Microsystems" )>=0) {
			System.out.println("PASS");
		}
				
		//trim(): removes leading & trailing spaces, not in between spaces		
		String t1 = "  Hello World!   ";
		System.out.println(t1.trim());
		
		//toLowerCase(),toUpperCase()
		
		String t2 = "Hello Java";
		System.out.println(t2.toUpperCase());
		System.out.println(t2.toLowerCase());
		
		//replace():
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-","/"));
		
		String l2 = "  Hello World!   ";
		System.out.println(l2.replace(" ", ""));//replace the space from everywhere
		
		//contains() : returns boolean true or false, it doesn't tell where
		
		String test = "I Love Java Coding!";
		System.out.println(test.contains("Java"));//true
		System.out.println(test.contains("java"));//false, case sensitive
		
		if(test.contains("Java")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		// .equals(): returns boolean, true/false, to compare two strings never use ==, always use .equals() method
		
		String r1 = "Hello Selenium";
		String r2 = "Hello selenium";
		System.out.println(r1.equals(r2));//true
		System.out.println(r1.equals(r2));//false, case sensitive
		System.out.println(r1.equalsIgnoreCase(r2));//true, ignores the case
		
		String n1="Hello Selenium";
		String n2="Hello selenium ";
		System.out.println(n1.equals(n2));//false, case sensitive
		System.out.println(n1.equalsIgnoreCase(n2));//false, space after selenium
		System.out.println(n1.equalsIgnoreCase(n2.trim()));//true
		
		//split(): 
		String lang = "JAVA_PYTHON_RUBY_JAVASCRIPT";
		//whenever we split it will create an array, index starts from 0
		//when we split, it will create an String array
		
		//return type of split is String[]
		String[] arr = lang.split("_");
		System.out.println(arr[0]);//JAVA
		System.out.println(arr[3]);//JAVASCRIPT
		System.out.println(arr.length);//4
		
		//print all elements of array
		System.out.println(Arrays.toString(arr));
		
		
		//Interview question:
		
		String pop = "xXHelloXxXSeleniumxXTestingXxXGoogleX";
		String[] pp = pop.split("xX"); 
		System.out.println(Arrays.toString(pp));
		
		//splitting on the basis of xX
		//here we are splitting on the basis of xX, before that we don't have any value, so we will get nothing
		System.out.println(pp[0]);//nothing
		//how to check we are getting nothing or space?, if length is 1 then space, 0 means nothing
		
		System.out.println(pp[0].length());//0 means nothing
		System.out.println(pp[1]);//HelloX
		System.out.println(pp[2]);//Selenium
		System.out.println(pp[3]);//TestingX
		System.out.println(pp[4]);//GoogleX
		
		//System.out.println(pp[5]);//AIOB
		
		
		
		//split based on x
		
		String[] pp1 = pop.split("x");
		System.out.println(pp1[0]);//nothing
		System.out.println(pp1[1]);//XHelloX
		System.out.println(pp1[2]);//XSelenium
		System.out.println(pp1[3]);//XTestingX
		System.out.println(pp1[4]);//XGoogleX
		
		System.out.println(Arrays.toString(pp1));
		
		System.out.println("Hello;Good:Evening".split(";")[0]);//Hello
		
		//split the below string & get the OTP
		//we can split using split space.
		String otp = "Your OTP number is 12345";
		
		String[] otp1 = otp.split(" ");
		System.out.println(Arrays.toString(otp1));
		System.out.println(otp1[otp1.length-1]);//12345
		
		
		
	}

}
