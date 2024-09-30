package inheritancePractice;

public class FinalMethodOverriding_Main {

	public static void main(String[] args) {
		
		FinalMethodOverriding_Child obj = new FinalMethodOverriding_Child();
		
		//we can access the parent class final methods, but we can't override
		
		obj.flyHigh();
		System.out.println(obj.a);//preference will be given to child class variable
	}

}

/*
Notes:Making a method final prevents method overriding.
*/