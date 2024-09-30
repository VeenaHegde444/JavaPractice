package javaBasicsPractice;

public class Browser_Practice {
	
	public void click(String element) {
		System.out.println("Click on element:"+element);
	}
	
	public void sendKeys(String element, String value) {
		System.out.println("Entering value "+value+" into the element"+element);
	}
	
	public String getTitle() {
		return "google";
	}

	
	// WAF: launchBrowser(String browserName)
	// browserName: chrome, firefox, safari, edge
	// return: print: success message and return boolean(true/false)
	
	static boolean flag = true;
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name: "+browserName);
		//boolean flag=true;
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome browser");
			break;
		case "firefox":
			System.out.println("launch firefox browser");
			break;
		case "safari":
			System.out.println("launch safari browser");
			break;
		case "edge":
			System.out.println("launch edge browser");
			break;

		default:
			System.out.println("Please pass the right browser name: "+browserName);
			//if we don't make the flag=false, it will always print the 'enter the url' which is wrong
			// so make it false in the default case
			flag=false;
			break;
		}
		return flag;
		
	}
	
	
	public boolean launchBrowser(String browserName, String browserVersion) {
		System.out.println("browser name is "+browserName+" and version is "+browserVersion );
		switch (browserName) {
		case "chrome":
			if(isValidVersion(browserVersion)) {
				System.out.println(browserName+" version is "+browserVersion);
			}
			else {
				System.out.println(browserName+" version is not correct "+browserVersion);
			}			
			break;
		case "firefox":
			if(isValidVersion(browserVersion)) {
				System.out.println(browserName+" version is "+browserVersion);
			}
			else {
				System.out.println(browserName+" version is not correct "+browserVersion);
			}
			break;
		case "safari":
			if(isValidVersion(browserVersion)) {
				System.out.println(browserName+" version is "+browserVersion);
			}
			else {
				System.out.println(browserName+" version is not correct "+browserVersion);
			}
			break;
		case "edge":	
			if(isValidVersion(browserVersion)) {
				System.out.println(browserName+" version is "+browserVersion);
			}
			else {
				System.out.println(browserName+" version is not correct "+browserVersion);
			}
			break;
		default:
			System.out.println("Please pass the correct browser name: "+browserName+" and browser version: "+browserVersion);
			flag=false;
			break;
		}
		return flag;
	}
	
	public boolean isValidVersion(String version) {
		return version != null;
	}
	
	
	//we can create a void method with blank 'return'

	public void submit(String element) {
		System.out.println("click on element"+element);
		return;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Browser_Practice obj = new Browser_Practice();
		boolean ex = obj.launchBrowser("chrome");
		if(ex) {
			System.out.println("Enter the url");
		}
		
		System.out.println("******************");
		
		obj.launchBrowser("ie", "120.0");
			
		

	

}


	
}
