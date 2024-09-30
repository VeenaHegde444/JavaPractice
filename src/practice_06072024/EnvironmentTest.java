package practice_06072024;

public class EnvironmentTest {

	public static void main(String[] args) {
		String environment = "veena";
		
		switch (environment.toUpperCase().trim()) {
		case "DEV":
			System.out.println("DEV environment");
			break;
		case "QA":
			System.out.println("QA environment");
			break;
		case "STAGING":
			System.out.println("STAGING environment");
			break;
		case "PROD":
			System.out.println("PROD environment");
			break;

		default:
			System.out.println("Please pass the right environment: "+environment);
			break;
		}

	}

}
