package javaBasicsPractice;
/*We can overload the main() method in java, but only one version of the main method is used as a entry point of the program 
 *which is 'public static void main(String[] args)'. The JVM recognizes this specific signature to start the execution of the program.
 * 
 */
public class OverloadingMainMethod_Practice {

	public static void main(String[] args) {
		System.out.println("Hello from main method");			
		OverloadingMainMethod_Practice.main("Hello");
		OverloadingMainMethod_Practice.main("Veena", "Advit");
	}
	
	public static void main(String arg1) {
		System.out.println("Hi");
	//	OverloadingMainMethod_Practice.main("Hi");
		
	}
	
	public static void main(String arg1, String arg2) {
		System.out.println("Hello Veena, Hi Advit");
	//	OverloadingMainMethod_Practice.main("Hi", "Hello");
		
	}

}

// can we overload main() method in java?
//Ans: Yes

/*jvm looks for 'public static void main(String[] args)' while starting the execution. If it doesn't find then we will not get the 'run by java 
 * application' option. Here 'args' is just a variable name, it can be anything.
 * main() method is void because it will not return anything
 * main() method is static because jvm don't need to create the object to call the static method, if it was non-static, jvm has to create object 
 * which leads to extra memory allocation 
 * main() method will be stored in metaspace(common memory allocation-cma)
 * If we have many main methods, to call/access them, we need to write classname.method name
 * There is no point in overloading the main method
 * 
 */

