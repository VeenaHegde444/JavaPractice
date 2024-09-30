package stringManipulations;
/*String concat(): it concatenates a string to the end of another string. It returns the combined string.
 * It returns NullPointerException if any one of the strings is null.
 * 
 * concat() method returns String.
 * 
 */
public class StringConcatenationEx {

	public static void main(String[] args) {
		String t1= "hello";//scp
		String t2 = "helloautomation";//scp
		
		t1= t1.concat("automation");//helloautomation
		//when we use concat() method, new string object will be created in the 'heap' , even if the same value exists in the string pool
		//t1=t1.concat("automation") creates a new String object in 'heap' with the value 'helloautomation'

		
//		System.out.println(t1.equals(t2));//true
		
//		System.out.println(t1==t2);//false, compares the memory address(references)
		
		t1.concat("automation").intern();
		System.out.println(t1.equals(t2));//true
		System.out.println(t1==t2);
		
		//
		
		String s1 = "testing";
		String s2=null;
		
	//	System.out.println(s1.concat(s2));//NullPointerException
		
		
		//StringBuilder
		
		StringBuilder sb1 = new StringBuilder("selenium");
		StringBuilder sb2 = new StringBuilder("selenium");
		//sb1.equals(sb2)
		
		System.out.println(sb1.equals(sb2));//false why?
		System.out.println(sb1==sb2);//false
		
		//the equals() method in StringBuilder & StringBuffer class is not overridden to compare the contents of StringBuilder objects.
		//.equals() method is inherited from Object class, which compares the memory addresses of the objects
		
		//instead we should use .toString() method
		
		System.out.println(sb1.toString().equals(sb2.toString()));//true
	}

}
