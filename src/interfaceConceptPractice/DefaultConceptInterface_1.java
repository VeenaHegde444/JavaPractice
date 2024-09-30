package interfaceConceptPractice;

public interface DefaultConceptInterface_1 {

	//interface variable
	//since variables are by default public,static & final, we have to initialize it
	int MAX_PRICE = 100;
	
	//abstract method
	
	public void square(int a);
	
	//abstract method with final keyword not allowed
	
	//public final void add();
	
	//abstract method with static not allowed
	
	//public static void division();
	
	//default method
	
	default void show() {
		System.out.println("Default method of 1st Interface executed");
	}
	
	

}
