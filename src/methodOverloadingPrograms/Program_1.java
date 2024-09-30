package methodOverloadingPrograms;
// In a class, one method has two overloaded forms. One form is defined as static and another form is defined as non-static.
//Is that method properly overloaded?
public class Program_1 {
	
	public void form() {
		System.out.println("print a");
	}
	
	public static void form(int a) {
		System.out.println("print a & b");
	}

	public static void main(String[] args) {
		

	}

}


//Ans: Yes, compiler checks only method signature to verify whether a particular method is properly overloaded or not.
//it doesn't check static or non-static feature of the method.'