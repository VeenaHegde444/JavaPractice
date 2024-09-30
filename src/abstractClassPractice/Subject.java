package abstractClassPractice;

public abstract class Subject {
	
	//constructor
	Subject(){
		System.out.println("Learning subject");
	}
	
	//abstract method
	
	abstract void syllabus();
	
	//non-abstract method
	
	void learn() {
		System.out.println("preparing right now!");
	}

}
