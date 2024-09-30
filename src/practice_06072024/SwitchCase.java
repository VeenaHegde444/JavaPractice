package practice_06072024;

public class SwitchCase {

	public static void main(String[] args) {
		String browserName = "chrome";
		
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		case "safari":
			System.out.println("launch safari");
			break;

		default:
			System.out.println("please pass the right browser: "+browserName);
			break;
		}

	}

}
