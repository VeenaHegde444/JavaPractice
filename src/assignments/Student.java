package assignments;
/*Create two Student objects and initialize their properties.

Print the details of each student and the total number of students.

Modify the age of one student and print the updated details.

Create another Student object and update the total number of students.

Print the details of the new student and the updated total number of students.

 */
public class Student {
	
	String name;
	int age;

	public static void main(String[] args) {
		
		int totalStudents = 0;
		
		//create 2 student objects & initialize their properties
		Student student1 = new Student();
		student1.name="Roger";
		student1.age=30;
		totalStudents++;

		Student student2 = new Student();
		student2.name="Steve";
		student2.age=25;
		totalStudents++;

		System.out.println("Name:"+student1.name+","+"Age:"+student1.age);		
		System.out.println("Name:"+student2.name+","+"Age:"+student2.age);
		System.out.println("Total number of students:"+totalStudents );
		
		//modify age of student1 & print updated details
		student1.age=35;
		System.out.println("After updation:");
		System.out.println("Name:"+student1.name+","+"Age:"+student1.age);
		System.out.println("Total number of students:"+totalStudents );
		
		//create another student & update total no of students
		Student student3 = new Student();
		student3.name="Mark";
		student3.age=45;
		totalStudents++;
		
		System.out.println("Name:"+student3.name+","+"Age:"+student3.age);
		System.out.println("Total number of students:"+totalStudents );
		

	}

}
