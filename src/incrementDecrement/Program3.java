package incrementDecrement;

public class Program3 {

	public static void main(String[] args) {
		int a  = 11;
		int b = 22;
		int c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("c=" +c);//11 + 22 + 11 +22 +13 + 24 = 103
		System.out.println("a=" +a);//13
		System.out.println("b=" +b);//23
		
		

	}

}
