package interfaceConceptPractice;

public class ApolloMainMethod {

	public static void main(String[] args) {
		//create the object of ApolloHospital
		
		ApolloHospital obj = new ApolloHospital();
		
		//can we access all implemented methods of interface? 
		//Yes, we can access
		
		//US methods
		obj.oncologyServices();
		obj.physioServices();
		obj.dentalServices();
		
		//UK methods
		obj.entServices();
		obj.pediatricServices();
		obj.dermaServices();
		
		//Indian methods
		
		obj.cardioServices();
		obj.orthoServices();
		obj.neuroServices();
		
		//how to access the Interface variables?
		//Ans: Using Interface name
		
		System.out.println(USMedical.MIN_PRICE);
		System.out.println(UKMedical.MIN_PRICE);
		System.out.println(IndianMedical.MIN_PRICE);
		
		//to access class variable use className since it is static
		System.out.println(ApolloHospital.MIN_PRICE); //ApolloHospital value will be printed
		
		//call the common method emergencyServices()
		obj.emergencyServices();
		
		//can we call the static methods of interface?
		//Ans: Yes, by using InterfaceName
		
		USMedical.billing();
		UKMedical.billing();
		IndianMedical.billing();
		
		//can we call static method of class?
		//Ans: Yes, using className
		
		ApolloHospital.billing();
		
		//can we access default method of class?
		//Ans: Yes, using object reference, here visibility is changed to 'public' from 'default'
		
		obj.medicalInsurance();
		
		//can we access the default method of interface?
		//Ans: 
		
		//creating the object of interface is not allowed
		//can't instantiate
		
		//USMedical obj1 = new USMedical();
		
		//Top Casting:
		//child class object can be referred by parent interface reference variable
		
		USMedical us = new ApolloHospital();
		
		//can we access the default method of interface?
		//Ans: Yes, by top casting
		us.medicalInsurance();
		
		us.dentalServices(); //US
		us.oncologyServices(); //US
		us.physioServices(); //US
		System.out.println(us.MIN_PRICE);
		us.emergencyServices(); //common method
		us.patientScreening();
		us.patientScreening(10);
		
		USMedical.billing();
		USMedical.reception();
		USMedical.reception(10);
		
		//we can't call the static method of interface directly, we can call with the InterfaceName
		USMedical.billing();
		
		
		
		

	}

}
