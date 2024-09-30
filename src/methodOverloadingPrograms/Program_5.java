package methodOverloadingPrograms;
//What will be the outcome of the below program?
public class Program_5 {
	
	double overloadedMethod(double d) {
		return d *= d;
	}
	
	 int overloadedMethod(int i)
	    {
	        return overloadedMethod(i *= i);//i=i*i;
	    }
	 
	    float overloadedMethod(float f)
	    {
	        return overloadedMethod(f *= f);
	    }

	public static void main(String[] args) {
		
		Program_5 main = new Program_5();
		System.out.println(main.overloadedMethod(100));//1000
	}

}

//Ans: StackOverflowError, overloadedMethod(int) keeps calling itself.
//i=100*100=10000
//i=10000*10000=100000000
//it keeps calling till StackOverflowError 
