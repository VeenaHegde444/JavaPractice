package incrementDecrement;

public class Program4 {

	public static void main(String[] args) {
		int i = 0;
		i = i++ - --i + ++i - i--;
		System.out.println(i);//0-0+1-1 = 0

	}

}
