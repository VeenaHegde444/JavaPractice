package stringManipulations_Practice;
/*StringBuilder: It is mutable in nature.
 * Not thread-safe.
 * Not synchronized.
 * Since Java 1.5
 * Faster.
 */
public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("selenium"); //only 1 object will be created
		
		sb.append("automation");
		System.out.println(sb);//seleniumautomation
		
		System.out.println(sb.charAt(5));//i
		
		String st = "selenium";
		//System.out.println(st.reve); reverse method is not available in String
		
		StringBuilder sb1 = new StringBuilder("selenium");//1 object will be created
		System.out.println(sb1.reverse());//muineles

	}

}
