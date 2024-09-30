package trickyJavaPrograms;

public class Program_8 {

	public static void main(String[] args) {
		System.out.println("Hello" == new String("Hello"));

	}

}
//"Hello" is a string literal
//string literals are interned, means all instances of same string literal point to the same memory location
//new String("Hello") creates a new object, it occupies a different memory location
//== will compare the references(memory addresses) of the objects, not their contents
//ans: false