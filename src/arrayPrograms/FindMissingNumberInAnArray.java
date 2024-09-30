package arrayPrograms;

public class FindMissingNumberInAnArray {
	
	public static void main(String[] args) {
		int[] a = {0,1,2,3,4,5,6,8,9,10};
		
		//1+2+4+5=12
		//1+2+3+4+5=15
		//15-12=3(missing no)
		
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		
		int sum1=0;
		for(int j=0;j<=10;j++) {// j is where the number starts
			sum1 = sum1 +j;
		}
			
		System.out.println(sum1);
		
		System.out.println("missing no. is: "+(sum1-sum));


	}

}
