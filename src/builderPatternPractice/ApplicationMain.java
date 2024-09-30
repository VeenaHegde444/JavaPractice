package builderPatternPractice;
/* use cases of 'this' keyword:
 * 1.to initialize class variables within constructor or method
 * 2.can be used with getter/setter : encapsulation
 * 3.to call same class constructor
 * 4.return from a function/method : Builder Pattern
 * 
 */
public class ApplicationMain {

	public static void main(String[] args) {
		//create object of Application
		
		Application app = new Application();
			
			//here we are creating just 1 object & will be able to access all methods in a chain
		
		//workflow chain scenario: Builder Pattern
		//1.
		app.login("veena@gmail.com", "veena@123")
		      .search("macbook pro")
		         .addToCart("macbook pro 16 inches")
		            .doPayment("veena@okhdfc")
		              .generateOrder()
		                .logout();
		
		//2.
		app.login("veena@gmail.com", "veena@123")
	          .search("iphone")
	             .addToCart("iphone 15")
	                .logout();
		
		//3.
		app.login("veena@gmail.com", "veena@123")  
              .logout();

		//4.
		app.login("veena@gmail.com", "veena@123")
		      .search("t-shirt")
		        .addToCart("nike t-shirt")
		           .doPayment("123 456 789", 123)
		              .generateOrder()
		                 .logout();
		
		//5.
		app.login("veena@gmail.com", "veena@123");
		
		//6.
		
		app.login()
		     .search("mixer",5000)
		        .addToCart("Bosch Mixer")
		           .doPayment("veena@okhdfc")
		              .generateOrder()
		                 .logout();
	}

}
