package stringManipulations_Practice;

public class StringIntern_Ex {

	public static void main(String[] args) {
/*		String s1 = new String("Java");//s1 is referring heap
		String s2 = s1.intern();//s2 referring SCP
		
		System.out.println(s1==s2);//false, compares memory location
		
		System.out.println(s1.equals(s2));//true, compares content
*/		
		
		String str1 = "java";//scp
		String str2 = new String("java");//heap, scp with no reference
		
		String str3 = str2.intern();//str3 is referring scp
		
		System.out.println(str1==str3);//true
		System.out.println(str1.equals(str3));//true
		System.out.println(str1.equals(str2));//true
		System.out.println(str2.equals(str3));//true
	}

}
