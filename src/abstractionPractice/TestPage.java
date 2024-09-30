package abstractionPractice;

public class TestPage {
	public static void main(String[] args) {
	
	//When we have constructor in both parent & child class, then it will call both classes constructors. Preference will be given to parent class constructor
	//first, then child class constructor
		
	// when we have a grand parent, then preference will be given to grand parent default constructor, followed by parent then child.
		
	LoginPage lp = new LoginPage(); //here it will call default parent class constructor first then calls child class default constructor
	lp.title();
	lp.url();
	lp.loading();
	lp.doLogin();
	
	
	LoginPage lp1 = new LoginPage(10,20); //here it calls default parent class constructor, then child class parameterized constructor 
	

	// It always calls parent class default constructor, even though we are passing parameterized constructor while creating object
	
	// we can't create the object of abstract class
	//Page p = new Page();
	
	//Top casting: child class object can be referred by parent class reference variable
	//top casting is allowed in abstarct class
	
	Page p = new LoginPage();
	//can access all methods of Page class
	p.title();
	p.url();
	p.loading();
	p.displayLogo();
	
	//we can't access the individual method of LoginPage class i.e doLogin()
	
	
	
	
	
	
	
	}

}
