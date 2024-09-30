package trickyJavaPrograms;

public class Program_11 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = new String("abc");
		System.out.println(s1.equals(s2) && s1 == s2);//false

	}

}
//s1 will be in string pool
//s2 will be in heap, new object will be created
//s1 == s2 is true
//s1.equals(s2) is false, since one is in string pool and other is in heap memory
//ans: false && true = false