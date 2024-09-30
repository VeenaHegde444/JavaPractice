package stringManipulations_Practice;

public class CompareTwoObjects {

	public static void main(String[] args) {
		String s1 ="abc"; //string literals, stored in string constant pool
		String s2 ="abc";//string literals, stored in string constant pool
		if(s1==s2) { //true
			System.out.println("YES");//YES
			//== compares s1 & s2 refer to the same object or not
			//== compares the object references
		}
		else {
			System.out.println("NO");
		}
		
		String str1 = new String("hello");//2 objects will be created, one will be in 'heap' with ref str1 & other will be in 'SCP' with no reference
		String str2 = new String("hello");//2 objects will be created, one will be in 'heap' with ref str2 & other will be in 'SCP' with no reference
		if(str1==str2) { //false, compares the object references
			System.out.println("YES");
			//== compares s1 & s2 refer to the same object or not
		}
		else {
			System.out.println("NO");//NO
		}
	}

}
