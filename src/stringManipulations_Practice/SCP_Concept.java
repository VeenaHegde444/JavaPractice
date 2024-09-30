package stringManipulations_Practice;

public class SCP_Concept {

	public static void main(String[] args) {
		String s1 = "a";
		String s2 = "a";
		String s3 = new String("a"); //2 objects will be created, one in 'heap' with s3 reference, another in 'SCP' with no reference
		
		/*String object will be created into String Constant Pool and reference to that object will be stored into variable s1;
          String Constant Pool will be looked-up, and because of there is an object with the same literal value ("a") found in the pool, 
          reference to the same object will be returned;
          String object will be explicitly created on the Heap area and the reference will be returned and stored into variable s3.
		 * 
		 * 
		 * 
		 */

		System.out.println(s1==s2);//true, reference check
		
		String s4 = s3.intern(); // when we say s3.intern(), reference will be given to 'SCP' object
		
		/*
		 * Internig Strings:

           If you wish to move the String object, created with new operator, into the String Constant Pool, you can invoke "your_string_text".intern(); 
           method, and one of two will happen:if the pool already contains a string equal to this String object as determined by the equals(Object) method,
           then the string from the pool will be returned;
           otherwise, this String object will be added to the pool and a reference to this String object will be returned.
		 */
		String m1 ="a";//allocated in 'SCP'
		m1=m1.concat("b");//concat() returns new String object , allocated in the 'heap'
		String m2 = "ab";// still doesn't exist in SCP
		System.out.println(s1==s2);//false, because one object is in 'heap' & another one in 'SCP'
		//as there already exists the object in the pool, with the same name, existing object will be returned by 'intern()'
		
		System.out.println(s1.intern() == s2);//true
	}

}
