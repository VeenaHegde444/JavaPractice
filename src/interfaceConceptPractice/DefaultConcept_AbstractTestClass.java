package interfaceConceptPractice;

public abstract class DefaultConcept_AbstractTestClass implements DefaultConceptInterface_1,DefaultConceptInterface_2{



	@Override
	public void show() {		
		DefaultConceptInterface_1.super.show();
		DefaultConceptInterface_2.super.show();
	}

}
