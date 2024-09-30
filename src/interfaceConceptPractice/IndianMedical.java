package interfaceConceptPractice;

public interface IndianMedical {
	
	int MIN_PRICE=50; //static & final
	
	void cardioServices();
	void orthoServices();
	void neuroServices();
	
	//common method
	void emergencyServices();
	
	public static void billing() {  //method hiding
		System.out.println("IndianMedical--billing");
	}
	
	//default method
	default void medicalInsurance() {
		System.out.println("IndianMedical--medical insurance");
	}

}
