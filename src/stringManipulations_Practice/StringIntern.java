package stringManipulations_Practice;

public class StringIntern {

	public static void main(String[] args) {
		String s = new String("hello java");//2 objects will be created, one in 'heap' one in 'SCP' with no reference
		String s1 = s.intern();//intern() method returns string
		
		//Whenever we create a object using new keyword, initially value will be given to SCP with no reference
		//so this is eligible for garbage collection
		//if we write s.intern(), reference 's1' will be given in String Constant Pool, so gc will not be eligible for this now
		//intern() method returns the string reference
		
		// for any two string s & t, s.inetrn() == t.intern() is true if & only if s.equals(t) is true
		
		System.out.println(s1);// hello java
		System.out.println(s);//hello java
		
		System.out.println(s == s1);//false, compares references, not contents
		
		System.out.println(s.equals(s1));//true, compares contents
		
		//1. when value is same
		
		String str1 = "Hello World";//SCP
		String str2 = new String("Hello World");//HEAP-1,SCP-1

		String st2 = str2.intern();
		System.out.println(st2);//Hello World
		
		System.out.println(str1==st2); //true, because memory location is same for both str1 & st2
		System.out.println(str1.equals(st2));//true, compares the content
		
		//2. when values are different
		
		String sg1 = "Hello"; //SCP
		String sg2 = new String("hello"); //HEAP-1, SCP-1 no ref
		
		String sg3 = sg2.intern(); //sg3 refers to SCP area
		System.out.println(sg1==sg3);//false, compares 
		System.out.println(sg1.equals(sg3));//false, compares contents
		



	}

}
