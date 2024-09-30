package assignments;

public class StringConcatenation_1 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		String s3 = s1 +s2;
		s3.intern();
		String s4 = "HelloWorld";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));

		
		//s3.intern() ensures that the string "HelloWorld" is added to the string pool. After interning, 
		//s3 & s4 refer to the same instance in the string pool, making s3 == s4 true.
		//Since the content of both strings is the same, s3.equals(s4) is also true.
	}

}
