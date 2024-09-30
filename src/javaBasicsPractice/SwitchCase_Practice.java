package javaBasicsPractice;

public class SwitchCase_Practice {

	public static void main(String[] args) {
		//cross browser logic
		String browser = "safari";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":{
			System.out.println("launch chrome");
			break;
		}
		case "firefox":{
			System.out.println("launch firefox");
			break;
		}
		case "edge":{
			System.out.println("launch edge");
			break;
		}
		case "ie":{
			System.out.println("launch ie");
			break;
		}
			
		default:
			System.out.println("Enter valid browser name:"+ browser);
			break;
		}

	}

}
