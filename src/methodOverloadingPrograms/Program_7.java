package methodOverloadingPrograms;
//What will be the output of the following program?
public class Program_7 {
	
	/*void method (String s1) {
		method(s1,s1+s1);
	}
	
	void method(String s1, String s2) {
		method(s1,s2,s1+s2);
	}
	
	void method(String s1, String s2,String s3) {
		method(s1+s2+s3);
	}
	
*/
	public static void main(String[] args) {
		//Program_7 obj = new Program_7();
		//obj.method("JAVA");//OutOfMemoryError: Overflow: String length out of range

	}

}
//calls 1st method & prints s1=JAVA,s1+s1=JAVAJAVA
//calls 2nd method & prints s1=JAVA,s2=JAVAJAVA, s1+s2=JAVAJAVAJAVA
//calls 3rd method & prints s1+s2+s3=JAVAJAVAJAVAJAVAJAVAJAVA
//o/p = JAVAJAVAJAVAJAVAJAVAJAVA