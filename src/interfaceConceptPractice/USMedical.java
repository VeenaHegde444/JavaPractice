package interfaceConceptPractice;
//methods in interface are implicitly public & abstract , no need to type 'public' & 'abstract'
//methods have no body, they are abstract
//We can't create object of Interface
//Interface can have static method with body & default method with body

//interface variables are by default public,static & final in nature
//Can we have the same variable in other interfaces? Ans:  Yes, we can have

public interface USMedical {
	
	int MIN_PRICE=100; //static & final
	

	
	void oncologyServices();
	void physioServices();
	void dentalServices();
	
	//can we create private method in Interface?
	//Ans: No, methods are by default public
	
	//private void freeMedical();
	
	//can we create final method in Interface?
	//Ans: No, methods are by default public
	
	//final void medicalResults();
		
	
	//Can we create a method which is common to all interface?
	//Ans:Yes, we can create
	
	void emergencyServices();
	
	//Can we create a method with body?
	//Ans: Yes, after JDK 1.8 can create a method with body but method has to be static.
	
	
	public static void billing() {
		System.out.println("USMedical--billing");
	}
	
	//we can have private abstract method in Interface?
	//Ans: No, we can't create private abstract method in interface
	
//	private void reportPrinting(); 
	
	//Can we create final abstract method in Interface?
	//Ans: No, we can't
	
//	public final void sayHello();
	
	// After JDK 1.8 we can create a non-static method with method body but it should written with 'default' keyword
	
	default void medicalInsurance() {
		System.out.println("USMedical--medical insurance");
	}
	
	//can we overload the static methods in Interface?
	//Ans: Yes, we can overload static methods in Interface
	
	public static void reception() {
		System.out.println("USMedical--reception");
	}

	
	public static void reception(int a) {
		System.out.println("USMedical--reception");
	}
		
		//can we overload default methods in interface?
		//Ans: Yes, we can overload default methods in Interface
		
		default void patientScreening() {
			
			System.out.println("USMedical--patient screening");			
		}
		
		default void patientScreening(int b) {
			
			System.out.println("USMedical--patient screening");			
		}
	
	//Can we overload abstract methods in Interface?
	//Ans: Yes, we can overload the abstract methods in Interface
		
		void oncologyServices(int a); //over loading
}
