package webDriverArchitecturePractice;

public class AmazonTest {

	public static void main(String[] args) {
		//In case of ChromeDriver driver = new ChromeDriver() we can't test for cross-browser functionality
		//if we want to run in chrome, other two lines we need to comment
		//so not a good approach 
		
	//	ChromeDriver driver = new ChromeDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
	//	SafariDriver driver = new SafariDriver();

		//cross-browser logic - top casting
		//top casting: child class object can be referred by the parent interface reference variable
		
		String browserName="chrome";
		WebDriver driver = null; 
		// it is a local variable inside the main method, initialization is mandatory before using it, 
		//since WebDriver is non-primitive, default value for non-primitives is 'null'
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();			
			break;
		case "firefox":
			driver = new FirefoxDriver();			
			break;
		case "safari":
			driver = new SafariDriver();			
			break;

		default:
			System.out.println("Please pass the right browserName"+browserName);
			break;
		}
		
		
		//access all the methods of WebDriver interface
		
		driver.get("https://google.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.sendKeys("search field", "Naveen automation labs");
		driver.click("searchIcon");
		
		driver.close();
		
		driver.getLogs();
		driver.getTitle();
	}

}
