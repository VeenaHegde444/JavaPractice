package assignments;
/*Q4: Print all the elements of this array in reverse order using for, for each, while and do-while loop:

int p[] = {1,3,4,5,22,56,89,90}
 * 
 */
public class ArrayAssignment_04 {

	public static void main(String[] args) {
	int p[] = {1,3,4,5,22,56,89,90};
	
	//using for loop
	
	for(int i=p.length-1;i>=0;i--) {
		System.out.println(p[i]);
	}

	System.out.println("*********************");
	
	//using for each loop
	
	int count=p.length-1;//highest index
	for(int e:p) {
		e=count;
		System.out.println(p[e]);
		count--;
	}
	
	System.out.println("*********************");
	
	//using while loop
	
	int j=p.length-1;
	while(j>=0) {
		System.out.println(p[j]);
		j--;
	}
	System.out.println("*********************");
	
	//using do while loop
	
	int k=p.length-1;
	do {
		System.out.println(p[k]);
		k--;
	}
	while(k>=0);
	
	
	}

}
