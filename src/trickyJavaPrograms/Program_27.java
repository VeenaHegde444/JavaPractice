package trickyJavaPrograms;

//why main method has to be static?
public class Program_27 {
	
	public Program_27(int i) {
		
	}

	public  void main(String[] args) {
		
		Program_27 obj = new Program_27(10);//
		

	}

}

// If we allow main() method to be non-static, then while calling the main method it has to create object. While creating the object, 
//it has to call constructor of that classs. There will be an ambiguity if constructor of that class takes an argument.