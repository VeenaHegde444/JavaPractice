package trickyJavaPrograms;

public class Program_15 {

	public static void main(String[] args) {
		  boolean a = true;
		  boolean b = false;
		  boolean c = a || b && !a;//true OR false AND false // false AND false
		  System.out.println(c);//true

	}

}
