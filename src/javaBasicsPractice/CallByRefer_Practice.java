package javaBasicsPractice;

public class CallByRefer_Practice {
	
	//global/instance variables
	String name;
	int age;
	
	//non-static method
	public void m1(int a) {
		System.out.println(a);
	}
	
	//static method
	public static void t1(CallByRefer_Practice p1) { // we can say p1=  obj, both are pointing to the same object
		//p1 is telling give me the object of this particular class
		//now we can call m1() method inside t1() since both are pointing to the same object
		p1.m1(10);
		
		//obj is manipulating name & age , so it will print 'Veena' & 25 , both p1 & obj are pointing to the same object
		System.out.println(p1.name);//Veena
		System.out.println(p1.age);//25
		
		//p1 is trying to manipulate the name & age values
		p1.name="Tom";
		p1.age=40;
		
		
	}
	public static void main(String[] args) {
		//create object to access non-static method
		
		CallByRefer_Practice obj = new CallByRefer_Practice();
		
		System.out.println(obj.name);//null
		System.out.println(obj.age);//0

		
		obj.name="Veena";
		obj.age=25;
		
		obj.m1(10);//call by value/argument
		
		//to call static method, using className or directly
		CallByRefer_Practice.t1(obj);// call by reference
		//here we have to provide the reference of that particular object i.e obj
		//here obj & p1 both are pointing to the same object (one  object can have multiple references)
		
		//after manipulating values in p1, values of name & age will be
		
		System.out.println(obj.name);//Tom
		System.out.println(obj.age);//40

	}

}

//when to use call by reference? : Page Object Model
//main advantage of call by reference is that avoid unnecessary object creation
