package methodOverloadingPrograms;
//is ‘method’ properly overloaded?
public class Program_4 {
	
	int method(int i, int d) {
		return i+d;
	}
	
	static int method(int i, double d) {
		return (int)(i+d);
	}
	
	double method(double i, int d) {
		return i+d;
	}
	
	static double method(double i, double d) {
		return i+d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//Ans: Yes
