package assignments;

//WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
public class Environment {

	public static void main(String[] args) {
		String environment = "qa";
		
		switch (environment.toUpperCase().trim()) {
		case "DEV":
			System.out.println("Development environment");
			break;
		case "QA":
			System.out.println("QA environment");
			break;
		case "UAT":
			System.out.println("UAT environment");
			break;
		case "STAGE":
			System.out.println("Staging environment");
			break;
		case "PROD":
			System.out.println("Production environment");
			break;

		default:
			System.out.println("Enter the valid environment: "+environment);
			break;
		}

	}

}
