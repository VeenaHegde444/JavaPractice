package javaBasicsPractice;

public class User_Practice_1 {
	
	//global variables are stored in Heap memory
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		//local variables & object references are stored in 'Stack' memory
		User_Practice_1 u1 = new User_Practice_1();
				u1.name = "Akash";
				u1.age=30;
				u1.city="Bengaluru";
				
				User_Practice_1 u2 = new User_Practice_1();
				u2.name = "Binu";
				u2.age=25;
				u2.city="Pune";
				
				User_Practice_1 u3 = new User_Practice_1();
				u3.name = "Caroline";
				u3.age=35;
				u3.city="Mumbai";
				
				System.out.println("Before assigning object reference:");
				
				System.out.println(u1.name+" "+u1.age+" "+u1.city);
				System.out.println(u2.name+" "+u2.age+" "+u2.city);
				System.out.println(u3.name+" "+u3.age+" "+u3.city);
				
				
				System.out.println("******************************");
				
				//assignment will start from right to left
				//first u2=u3
				//then u1=u2
				//output: u1=Caroline,u2=Caroline,u3=Caroline
				u1=u2=u3;
				
				System.out.println(u1.name+" "+u1.age+" "+u1.city);
				System.out.println(u2.name+" "+u2.age+" "+u2.city);
				System.out.println(u3.name+" "+u3.age+" "+u3.city);

	}

}
