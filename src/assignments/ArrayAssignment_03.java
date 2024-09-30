package assignments;
/*Q3: Print all the elements of this array using for, for each, while and do-while loop:

int p[] = {1,3,4,5,22,56,89,90}
 * 
 */
public class ArrayAssignment_03 {

	public static void main(String[] args) {
		int p[] = {1,3,4,5,22,56,89,90};
		int i;
		//using for loop
		
		for (i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		System.out.println("************");
		
		//using for each loop
		
		for(int e:p) {
			System.out.println(e);
		}
		
		System.out.println("Using while loop:");
		
		//using while loop
		
		int j=0;
		
		while(j<p.length) {
			System.out.println(p[j]);
			j++;
		}
		
		//using do while loop
		System.out.println("Using do while loop:");
		
		int k=0;
		do {
			System.out.println(p[k]);
			k++;
		}
		while(k<p.length);
		

	}

}
