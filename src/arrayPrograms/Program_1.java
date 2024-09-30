package arrayPrograms;
//What is ArrayStoreException in Java? When you will get this exception?
public class Program_1 {

	public static void main(String[] args) {
		Object[] arr = new String[3];//no compile time error, String[] is auto-upcasted to Object[]
		arr[0]="Hello";
		arr[1]=100;
		arr[2]="Veena";
		
	System.out.println(arr[1]);//java.lang.ArrayStoreException: java.lang.Integer

	}

}

//Ans: ArrayStoreException is a run time exception which occurs when you try to store non-compatible element in an array object.