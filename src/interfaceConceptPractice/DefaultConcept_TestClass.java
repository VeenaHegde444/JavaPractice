package interfaceConceptPractice;

public class DefaultConcept_TestClass implements DefaultConceptInterface_1,DefaultConceptInterface_2 {

	@Override
	public void square(int a) {
		System.out.println(a*a);
		
	}
	
	@Override
	public void square(int a, int b) {
		System.out.println(a*b);
		
	}

	//can we override the default methods of interface in class?
	//Yes, we can, by making 'public'. We can access default method of Interface using 'InterfaceName.super'.
	
	//In case both the implemented interfaces contain default method with same method signature, the implementing class should explicitly
	//specify which default method is to be used or it should override the default method
	
	@Override
	public void show() {
		DefaultConceptInterface_1.super.show();
		DefaultConceptInterface_2.super.show();
	}




}
