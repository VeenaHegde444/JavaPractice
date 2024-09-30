package exceptionHandling_Practice;
/* throws keyword:
 * just to supply the exception from one method to another method
 * it is used as an identifier
 * 
 */
public class Browser {
	
	//amazon app
	public void search(){
		System.out.println("search");
		cart();
	}
	
	//amazon app
	public void cart() {
		System.out.println("cart");
		try {
		bankPayment();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	
	//HDFC bank application: 3rd party system
	public void bankPayment() throws ArithmeticException{
		System.out.println("bank payment method");
		int i = 9/0;
		
	}
	
	
     //caller method : user method , we should never add any try/catch in main method
	//purpose of main() method is to create object & call methods or features 
	public static void main(String[] args) {
		
		Browser br = new Browser();
		br.search();
		
		System.out.println("Bye");
		

	}

}
