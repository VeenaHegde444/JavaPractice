package trickyJavaPrograms;
//Which one will be faster?
public class Program_30 {

	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
			System.out.println(i);
		}
		
		System.out.println("*******************");
		
		for(int i=1000;i>0;i--) {
			System.out.println(i);
		}

	}

}
