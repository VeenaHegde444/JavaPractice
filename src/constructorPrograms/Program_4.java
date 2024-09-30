package constructorPrograms;
//Is there any compiler error in the below Java program? 
public class Program_4 {
	int m_x,m_y;
	
	//parameterized constructor
	public Program_4(int x, int y) {
		m_x = x;
		m_y=y;	
	}
	
	public static void main(String[] args) {
		//Program_4 t1 = new Program_4();
		//if we create object without passing arguments it will throw an error 'the constructor is undefined'
	
	}

}

//Ans: 20