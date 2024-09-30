package stringManipulations_Practice;
/*String literals: Whenever we create String str = "Hello"; it will be stored in 'String Constant Pool-SCP'. It is part of heap memory.
 * It is only applicable for strings.
 * 
 * Why do we have SCP only for String data type & not for other data types in Java?
 * Ans: Because String is the most commonly used data type in any application, thats why String has a special treatment in Java.
 * 
 * '==' : it is an operator, it is used to compare references(address comparison), memory location
 * .equals(): it is a method, it is used to compare two string contents
 * 
 * Strings are immutable means they are constant & can't be changed once created.
 * 
 *  Best approach is to create string using 'string literals'.
 *  
 *  String literals are used for memory optimization technique.
 *  
 *  whatever operation we perform on strings like trim(),toUpperCase(),toLowerCase() it will create new values, thats why whatever we perform will become
 *  a costly operation.
 *  
 *  Garbage collector is applicable for SCP also, but priority will be given to heap objects which doesn't have any reference or pointing to null.
 *  Then it will go & check in SCP, since SCP's have only contents.
 *  
 *  String is thread safe.
 */
public class StringCompare {

	public static void main(String[] args) {
	
	//create string using string literals
	//always create string using 'string literals'
	String s1 = "hello selenium"; //stored in SCP
	
	//create string using new keyword
	String s2 = new String("hello selenium"); // 2 objects will be created, one in 'heap' with reference as s2 & other in 'SCP' without reference.
	
	System.out.println(s1 == s2);// false, here we are comparing s1 & s2 references not contents
	
	System.out.println(s1.equals(s2));//true, here we are comparing s1 & s2 contents
	
	String s3 = "hello selenium"; // doesn't create the new string, s3 will start pointing to 'hello selenium'
	System.out.println(s1 == s3);//true, s1 & s3 both are pointing to 'hello selenium'
	System.out.println(s1.equals(s3));//true, contents are same
	System.out.println(s2==s3);//false, comparing references
	System.out.println(s3.equals(s2));//true
	
	String s4 = "hello Selenium"; // new string 'hello Selenium' will be created in SCP
	System.out.println(s1==s4);//false, reference comparison
	System.out.println(s3==s4);//false, reference comparison
	System.out.println(s1.equals(s2));//false, content comparison
	
	
	String str = new String("testing"); //2 values will be created, one in 'heap' with str as reference, one in 'SCP' without reference
	String st ="testing";//doesn't create again( SCP-->0), st will start pointing to 'testing'
	String st1 ="Testing"; // create new string in SCP
	
	//concat
	String t1="hello";
	t1.concat("automation");
	System.out.println(t1);//hello
	t1=t1.concat("automation");
	System.out.println(t1);//helloautomation
	String t2="helloautomation";
	System.out.println(t1.equals(t2));//true, compares content
	
	
	
	
	

	}

}
