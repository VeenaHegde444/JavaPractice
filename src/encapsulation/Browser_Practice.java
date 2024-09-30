package encapsulation;

public class Browser_Practice {
	
	public void launchBrowser() {
		System.out.println("launch the browser");
		//we can directly call private methods in the same class
		checkRAMSize();
		checkBrowserUpdates();
		verifyStorage();
		checkBrowserPolicy();
		
	}
	
	private void checkRAMSize() {
		System.out.println("check RAM size");
	}
	
	private void checkBrowserUpdates() {
		System.out.println("check browser updates");
	}
	
	private void verifyStorage() {
		System.out.println("verify storage");
	}
	
	private void checkBrowserPolicy() {
		System.out.println("check browser policy");
	}

}

//In above example, the user doesn't have to worry about the internal checking while launching the browser. So make only launchBrowser public & all other
//methods private & call them directly inside the public method. That way user will not get to know what is happening inside the launchBrowser method.
