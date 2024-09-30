package builderPatternPractice;

//another use case of 'this' keyword in 'Builder Pattern'
//we can use 'this' keyword to return from the method
//we can achieve builder pattern using 'this' keyword
//it has to be in the same class, no inheritance
//Ex: Rest Assured, e-commerce applications, Actions class
//code is more readable
//we use Builder Pattern when we have workflow chain scenarios
public class Application {
	
/*	public Application login() {     //instead of void we should use the 'className'
		System.out.println("login to app");
		return new Application(); // we should never create one more object here, instead we should write 'return this' 
	}
*/
	
	
	
	public Application login() {
		System.out.println("login to app");
		return this; // this will return the current class object, 
		//when we call 'login' method from main() method, object is already created in the memory, so need to create the object again
		//the object has all the methods, so we can chain easily
	}
	
	public Application login(String uid, String pwd) {
		System.out.println("login to app with: "+ uid+" "+pwd);
		return this;
	}
	
	public Application search(String productName) {
		System.out.println("searching the product: "+productName);
		return this;
	}
	
	public Application search(String productName, int price) {
		System.out.println("searching the product: "+productName +"price: "+price);
		return this;
	}
	
	public Application addToCart(String productName) {
		System.out.println("adding to cart: "+productName);
		return this;
	}
	
	public Application doPayment(String upi) {
		System.out.println("making payment using upi: "+upi);
		return this;
	}
	
	
	public Application doPayment(String cc, int cvv) {
		System.out.println("making payment using cc: "+cc+" "+cvv);
		return this;
	}
	
	public Application generateOrder() {
		System.out.println("Your order id is: "+12345);
		return this;
	}
	
	public Application logout() {
		System.out.println("logout");
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
