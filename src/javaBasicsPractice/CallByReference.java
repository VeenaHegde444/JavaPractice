package javaBasicsPractice;

public class CallByReference {
	
	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}
	
	public static void t1(CallByReference p1) { //passing object as a input parameter with reference value, here p1= obj
		//try to access m1() method, here static method is trying to access non-static method, so we need to create the object. If there are 10 non-static methods
		//and 1 static method & all of them wants to access non-static method, we need to create 10 objects
		//to resolve the above issue, we need to use call by reference
		//here pass the object as a input parameter which is 'CallByReference' and one reference variable
		//here both obj & p1 referring the same object
		//now we can call m1() method with the reference p1
		
		p1.m1(10);
		
		//we can access both name & age since both are non-static variables & one copy will be given to each object, since p1 is also referring the same object
		//it can access both name & age
		System.out.println(p1.name);//Veena
		System.out.println(p1.age);//25
		
		
		//now try to manipulate name & age inside t1() method using p1 reference
		
		p1.name="Peter";
		p1.age=45;
	}
	

	public static void main(String[] args) {
		//create object to access non-static method i.e m1()
		CallByReference obj = new CallByReference();
		
		//after object creation try to print the value of name & age
		
		System.out.println(obj.name);//String default value = null
		System.out.println(obj.age);//Integer default value = 0
		
		//now pass the values
		obj.name="Veena";
		obj.age=25;
	
		//after assigning the values try to print name & age
		
		System.out.println(obj.name);//Veena
		System.out.println(obj.age);//25

		//access the static method using className
		
		CallByReference.t1(obj);//this is called call by reference, here we have to pass the object reference i.e obj to access the static method
		
		//after changing the name & age values inside t1() method using object reference, try to print the values of name & age
		//because both p1 & obj are referring the same object, means single object can have multiple object references
		//so if we try to manipulate the values inside t1() method, latest values will be picked since p1=obj, both are referring the same object 
		
		System.out.println(obj.name);//Peter
		System.out.println(obj.age);//45

	}

}
