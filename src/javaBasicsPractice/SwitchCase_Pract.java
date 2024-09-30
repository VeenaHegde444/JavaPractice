package javaBasicsPractice;

public class SwitchCase_Pract {

	public static void main(String[] args) {
		String method = "POST";
		switch (method) {
		case "GET":
			System.out.println("GET statement");			
			break;
		case "PUT":
			System.out.println("PUT statement");			
			break;
		case "POST":
			System.out.println("POST statement");			
			break;
		case "DELETE":
			System.out.println("DELETE statement");			
			break;

		default:
			System.out.println("Enter proper API method: "+method);
			break;
		}

	}

}
