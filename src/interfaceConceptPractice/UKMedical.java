package interfaceConceptPractice;

public interface UKMedical {
	
	int MIN_PRICE=150; //static & final
	
	void entServices();
	void pediatricServices();
	void dermaServices();
	
	//common method
	
	void emergencyServices();
	
	//can we override the static method of 'USMedical' interface?
	//Ans: No, we can't override the static method, but we can have the exact same method in 'UKMedical' as well, it is called 'method hiding'.
	
	
	
	public static void billing() { //method hiding
		System.out.println("UK--billing");
	}
	
	//can we override the default method of'USMedical' interface?
	//Ans: No, it will throw an error in 'ApolloHospital' saying duplicate default methods
	//We can create same default method 
	
	default void medicalInsurance() {
		System.out.println("UKMedical--medical insurance");
	}

	

}
