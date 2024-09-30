package constructorPrograms;
//what is the o/p?
public class Program_3 {
	int t=20;
	
	//default constructor
	Program_3(){
		t=40;
	}
	public static void main(String[] args) {
		Program_3 t1 = new Program_3();
		System.out.println(t1.t);//40

	}

}

//Ans: 20