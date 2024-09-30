package javaBasicsPractice;
/* return this: statement is used in all functions of the class which returns the current class object
 * The return type of the function which has 'return this' , statement should be className.
 * Advantage: 
 * Use of Builder pattern is that method chain can be created as function returns the object of the class.
 * 
 */
public class BuilderPattern_Ex {
	
	 public BuilderPattern_Ex EnterLogin(String login) { //public className EnterLogin()
		 System.out.println("Entered the login");
		 return this;
	 }
	 
	 public BuilderPattern_Ex searchProduct() {
		 System.out.println("product searched");
		 return this;
	 }
	 
	 public BuilderPattern_Ex addToCart() {
		 System.out.println("product added to cart");
		 return this;
	 }
	 
	 
	 public static void main(String[] args) {
		 BuilderPattern_Ex obj = new BuilderPattern_Ex();
		 obj.EnterLogin("2024May").searchProduct().addToCart();
	 }

}
