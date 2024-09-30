package trickyJavaPrograms;
//output of following code
public class Program_4 {

	public static void main(String[] args) {
		int a =10;
		System.out.println(a += (a=5) *(a/5));

	}

}
/*
a=10;
a=5;//assign a to 5
(a=5)*(a/5)=5*(5/5)=5*1=5
a+=5  (a=5+5, a=10)    a was initially 10 but reassigned to 5
a=10+5=15
a=15

*/