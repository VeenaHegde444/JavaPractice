package assignments;

public class IncrementDecrement_6 {

	public static void main(String[] args) {
		int a=1,b=2;
		int c = --b - ++a + ++b - --a;
		System.out.println(c);//1-2+2-1 = 0
		System.out.println(a);//1
		System.out.println(b);//2

	}

}
