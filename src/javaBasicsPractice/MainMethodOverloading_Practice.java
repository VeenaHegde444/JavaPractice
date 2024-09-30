package javaBasicsPractice;

public class MainMethodOverloading_Practice {

	public static void main(String[] args) {
		System.out.println("Hello");
		//calling another static method using className
		MainMethodOverloading_Practice.main(10);
	
	}
	
	public static void main(int a) {
		System.out.println("Hi " + a);
		MainMethodOverloading_Practice.main(a, 30);
	
	}
	
	public static void main(int a,int b) {
		System.out.println("Hi & Hello "+ (a+b));
	
	}

}

//main() method can be overloaded. But JVM will look for 'public static void main(String[] args)' while executing the java program.
//Because it is a starting point to the application. If that signature is not found, then we don't get the 'run as java application'.
//We can call the static method inside another static method using 'className'.
//JVM will call the main method, thats why it is static in nature, if it is static, object creation is not required.
//why main method is void? Because main() method will not return anything, we never write business logic in main() method.
//main() method will be stored in 'cma' because it is static
//who is passing String[] args parameter? JVM will pass String array parameter, JVM will supply one blank array
//Why main() method will accepts only String[] array as arguments?  Because it stores command line arguments which could be anything. Its best to accept them as
//an array of strings & later decide to cast them accordingly 