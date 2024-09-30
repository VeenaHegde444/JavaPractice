package interfaceConceptPractice;

//use the keyword 'implements'
//single class can an implement multiple interfaces, comma separated
//once the class implemented interface, implementing abstract methods is mandatory, it is actually method overriding
// can class can have the same variable? Ans: Yes, but we have to make it static & final

public class ApolloHospital implements USMedical,UKMedical,IndianMedical{
	
	static final int MIN_PRICE=200;

	@Override
	public void cardioServices() {
		System.out.println("India--cardio services");
		
	}

	@Override
	public void orthoServices() {
		System.out.println("India--ortho services");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("India--neuro services");
		
	}

	@Override
	public void entServices() {
		System.out.println("UK--ent services");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("UK--pediatric services");
		
	}

	@Override
	public void dermaServices() {
		System.out.println("UK--derma services");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("US--oncology services");
		
	}

	@Override
	public void physioServices() {
		System.out.println("US--physio services");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("US--dental services");
		
	}

	//though all the interfaces have the same common method emergencyServices(), we have to implement only once in the 'ApolloHospital' class
	@Override
	public void emergencyServices() { //common method
		System.out.println("ApolloHospital--emergency services");
		
	}
	
	//can we have a exact same static method of interface in 'ApolloHospital' class?
	//Ans: Yes, we can create, but its not method overriding, it is 'method hiding'
	//we can't override static methods
	
	public static void billing() { //method hiding
		System.out.println("ApolloHospital--billing");
	}
	
	
	//can we override a default method of interface with public ?
	//Ans: Yes, we can override with public keyword
	
	@Override
	public void medicalInsurance() { // default method of interface, change 'default' to 'public' to override
		
		//we can call default methods of Interface using InterfaceName.super in class
		
		USMedical.super.medicalInsurance();
		UKMedical.super.medicalInsurance();
		IndianMedical.super.medicalInsurance();
		
		System.out.println("ApolloHospital--medical insurance");
	}
	

	
	
	//can we override a method from grand parent?
	//Ans: Yes, we can override from grand parent also
	
	public void covidVaccination() {
		System.out.println("ApolloHospital--covid vaccination");
	}

	@Override
	public void oncologyServices(int a) { //
		System.out.println("ApolloHospital--oncology services");
		
	}
	
	//Can we have a default method in class?
	//Ans: we can't have a default method in a class, we can have it in only interfaces

/*	default void sayHello() {
		
	}
*/
}
