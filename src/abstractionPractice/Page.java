package abstractionPractice;

//we can have both abstract and non abstract methods
//0% abstraction -- yes
//100% abstraction -- yes
//partial abstraction -- yes

//can not create the object of abstract class

//but can we have constructor... of the abstract class: this is allowed
//and it will be called when you create the object of the child class

//this is mandatory if you have any parameterize constructor.. in parent class

public abstract class Page extends GrandParentPage{
	
	//constructors
	
	//default constructor is mandatory in parent class
	public Page() {
		System.out.println("page const...default");
	}
	
	public Page(int a) {
		System.out.println("page const..." + a);
	}
	
	public Page(int a, int b) {
		System.out.println("page const..." + a+b);
	}
	
	    //abstract methods
		public abstract void title();
		public abstract void url();

		
		//non abstract methods
		public void loading() {
			System.out.println("page loading in 20 secs");
		}
		
		//because Logo is common to all pages, so make it final
		public final void displayLogo() {
			System.out.println("mylogo.jpg");
		}

}
