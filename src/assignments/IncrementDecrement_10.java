package assignments;

public class IncrementDecrement_10 {

	public static void main(String[] args) {
		int a =1;
		a = a++ + ++a * --a - a--;
		System.out.println(a);//1+3*2-2=5

	}

}
