package superKeywordPractice;

public interface Automation {
	
	int time = 100; // interface variables are by default public static & final
	
	//abstract method
	
	void sayHello();
	
	//default method
	
	default void billing() {
		System.out.println("default method of interface");
	}

}
