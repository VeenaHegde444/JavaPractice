package trickyJavaPrograms;
//result of this code
public class Program_2 {

	public static void main(String[] args) {
		String str = null;
		if(str instanceof String) {
			System.out.println("True");
		}
		else {
			System.out.println("False");//False
		}
	}

}

//Ans: 'instanceof' operator checks whether the str object is an instance of the 'String' class
//null is not an instance of any type
//so ans is 'False'
//instanceof operator checks runtime type of the object to its left against the type specified to its right
//when left side is null, the result of 'instanceof' is always false, regardless on the type on the right hand side
//'null' doesn't refer to any object , so it can't be instance of any class