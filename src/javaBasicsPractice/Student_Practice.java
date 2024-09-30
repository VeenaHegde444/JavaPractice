package javaBasicsPractice;

public class Student_Practice {
	
	Object[] student; 

	public static void main(String[] args) {
		Student_Practice obj = new Student_Practice();
		obj.student = new Object[5];
		obj.student[0]="Veena";//name
		obj.student[1]=30;//age
		obj.student[2]=2000.25;//salary
		obj.student[3]='f';//gender
		obj.student[4]=true;//isPermanent
		
		System.out.println(obj.student[0]+" "+obj.student[1]+" "+obj.student[2]+" "+obj.student[3]+" "+obj.student[4]);

	}

}
