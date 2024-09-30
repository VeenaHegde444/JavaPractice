package javaBasicsPractice;

public class StudentSheet_Practice {
	
	//WAF: getStudentMarks(String name)
	//return: marks(int)
	//0 to 100
	//studnet is not found : return -1
	
	public int getStudentMarks(String name) {
		System.out.println("Student name: "+name);
		
		switch (name.toLowerCase().trim()) {
		case "Veena":
			return 100;
			
		case "Advit":
			return 99;
			
		case "Akshar":
			return 90;
			
		case "Sam":
			return 10;

		default:
			System.out.println("Pass the correct student name: "+name);
			return -1;		
		}
		
	}	
	
		public int Addition(int a,int b) {
			System.out.println("Sum is:"+(a+b));
			switch (a+b) {
			case 1:
				return a+b;
			case 2:
				return a+b;
			case 3:
				return a+b;
			case 4:
				return a+b;
				
			default:
				return -1;
			}		
		
	}
	
//in Switch case statement when there is a 'return' , 'break' is not required (if we write break it will throw an error 'dead code')
	public static void main(String[] args) {
		StudentSheet_Practice obj = new StudentSheet_Practice();
		obj.getStudentMarks("neha");
		
		obj.Addition(1,2);

	}

}
