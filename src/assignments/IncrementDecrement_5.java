package assignments;

public class IncrementDecrement_5 {

	public static void main(String[] args) {
		int i =1,j=2,k=3;
		int m = i-- - j-- - k--;
		
		System.out.println("i="+i);//0
		System.out.println("j="+j);//1
		System.out.println("k="+k);//2
		System.out.println("m="+m);//1-2-3=-4

	}

}
