package javaBasicsPractice;

public class StaticFinal_Keywords {
	
	String name;
	int age;
	static final String college_name ="KUD";
	

	public static void main(String[] args) {
		
		StaticFinal_Keywords obj = new StaticFinal_Keywords();
		obj.name="Darshan";
		obj.age=20;
		System.out.println("Name is:"+obj.name+","+"Age is:"+obj.age);
		System.out.println("College name is:"+StaticFinal_Keywords.college_name);
	}

}
