package javaBasicsPractice;

public class User_Practice {
	//global variables are stored in Heap memory
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		//local variables & object references are stored in 'Stack' memory
		User_Practice u1 = new User_Practice();
		u1.name = "Akash";
		u1.age=30;
		u1.city="Bengaluru";
		
		User_Practice u2 = new User_Practice();
		u2.name = "Binu";
		u2.age=25;
		u2.city="Pune";
		
		User_Practice u3 = new User_Practice();
		u3.name = "Caroline";
		u3.age=35;
		u3.city="Mumbai";
		
		User_Practice u4 = new User_Practice();
		u4.name = "David";
		u4.age=40;
		u4.city="Delhi";
				
		
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		System.out.println(u4.name+" "+u4.age+" "+u4.city);
		
		System.out.println("******************************");
		
		u1=u2;//u1 obj is pointing to u2 obj
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//u1.name=Binu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//u2.name=Binu
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//u3.name=Caroline
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//u4.name=David
		
        System.out.println("******************************");
		
		u2=u3;// u2 obj is pointing to u3 object
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//u1.name=Binu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//u2.name=Caroline
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//u3.name=Caroline
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//u4.name=David
		
		System.out.println("******************************");
			
		u3=u4;//u3 obj is pointing to u4 obj
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//u1.name=Binu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//u2.name=Caroline
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//u3.name=David
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//u4.name=David
		
		System.out.println("******************************");
		
		u4=u1;//u4 obj is pointing to u1 obj but u1 obj is pointing to u2 obj
		System.out.println(u1.name+" "+u1.age+" "+u1.city);//u1.name=Binu
		System.out.println(u2.name+" "+u2.age+" "+u2.city);//u2.name=Caroline
		System.out.println(u3.name+" "+u3.age+" "+u3.city);//u3.name=David
		System.out.println(u4.name+" "+u4.age+" "+u4.city);//u4.name=Binu

	}

}
