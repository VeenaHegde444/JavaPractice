package constructorPrograms;
//o/p of the following program
public class Program_5 {
	int m_x,m_y;
	
	//parameterized constructor
	public Program_5(int x, int y) {
		m_x = x;
		m_y = y;	
	}
	
	//default constructor
	public Program_5() {
		this(10,10);
	}
	//method
	public int getX() {
		return m_x;
	}
	//method
	public int getY() {
		return m_y;
	}
	
	public static void main(String[] args) {
		Program_5 p = new Program_5();
		System.out.println(p.getX());//10
	
	}

}

//Ans: 20