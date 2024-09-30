package assignments;
/* Q2: Write a program to create a static Array, having following cricket data:

                        --name, age, team name, DOB, gender, Strike Rate

                        --Try to create multiple Object Arrays for different players 

                        --Try to print all the values of each player on the console using for and for each loops
 * 
 */
public class ArrayAssignment_02 {

	public static void main(String[] args) {
		
		Object obj[] = new Object[6];
		obj[0] = "Virat Kohli";
		obj[1] = 35;
		obj[2] = "RCB";
		obj[3] = "05-11-1988";
		obj[4] = 'M';
		obj[5] = 154.70;
		
		
		//using for loop
		
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("*************");
		
		//using for each loop
		
		for(Object e:obj) {
			System.out.println(e);
		}

		System.out.println("*************");		
		
		Object obj1[] = new Object[6];
		
		obj1[0] = "Dinesh Kartik";
		obj1[1] = 38;
		obj1[2] = "RCB";
		obj1[3] = "01-06-1985";
		obj1[4] = 'M';
		obj1[5] = 187.35;
		
		//using for loop
		
		for(int i=0;i<obj1.length;i++) {
			System.out.println(obj1[i]);
		}
		
		System.out.println("*********************");
		
		//using for each loop
		
		for(Object e:obj1) {
			System.out.println(e);
		}
		
		System.out.println("*********************");
		
		Object obj2[] = new Object[6];
		
		obj2[0] = "Smriti Mandhana";
		obj2[1] = 27;
		obj2[2] = "RCB";
		obj2[3] = "18-07-1996";
		obj2[4] = 'F';
		obj2[5] = 145.4;
		
		//using for loop
		
		for(int i=0;i<obj2.length;i++) {
			System.out.println(obj2[i]);
		}
		
		System.out.println("********************");
		
		for(Object e: obj2) {
			System.out.println(e);
		}
		
System.out.println("*********************");
		
		Object obj3[] = new Object[6];
		
		obj3[0] = "Ellyse Perry";
		obj3[1] = 33;
		obj3[2] = "RCB";
		obj3[3] = "03-11-1990";
		obj3[4] = 'F';
		obj3[5] = 125.72;
		
		//using for loop
		
		for(int i=0;i<obj3.length;i++) {
			System.out.println(obj3[i]);
		}
		
		System.out.println("********************");
		
		for(Object e: obj3) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
