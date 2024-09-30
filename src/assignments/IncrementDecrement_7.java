package assignments;

public class IncrementDecrement_7 {

	public static void main(String[] args) {
		int i =19, j =29,k=0;
		int m = i-- -j-- -k --;
		
		System.out.println("i="+i);//18
		System.out.println("j="+j);//28
		System.out.println("k="+k);//-1
		System.out.println("m="+m);//-10
	}

}
