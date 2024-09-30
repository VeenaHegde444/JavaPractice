package javaBasics;

public class ConstructorEx {
	static String name ="Veena";
	final int age;
	
	ConstructorEx(int age){
		this.age=age;
	}
	
	public static void main(String[] args) {

		ConstructorEx obj = new ConstructorEx(20);
		
		ConstructorEx obj1 = new ConstructorEx(30);
		
		System.out.println(obj.name+" "+obj.age);
		System.out.println(obj1.name+" "+obj1.age);
		
	}

}



