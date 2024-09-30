package interfaceConceptPractice;

public interface DefaultConceptInterface_2 {
	
	//abstract method
	
	public void square(int a, int b);
	
	//default method
	
	default void show() {
		System.out.println("Default method of 2nd Interface executed");
	}
		
	//default method with return type
	default double add(double a) {
		return a;
	}

}
