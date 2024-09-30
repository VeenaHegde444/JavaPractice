package assignments;

/*WAP to launch browsers using If-ElseIf and Switch Case.

Browser: Chrome/Firefox/IE/Safari

If user passes wrong browser, print please pass the right browser name
*/
public class LaunchBrowser {

	public static void main(String[] args) {
		String browser = "edge";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome launched");
			break;
		case "firefox":
			System.out.println("Firefox launched");
			break;
		case "ie":
			System.out.println("IE launched");
			break;
		case "safari":
			System.out.println("Safari launched");
			break;
		default:
			System.out.println("Pass the right browser name: "+browser);
			break;
		}

	}

}
