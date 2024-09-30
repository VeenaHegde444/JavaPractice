package encapsulation;

public class LoginPage_Practice_Main {

	public static void main(String[] args) {
		LoginPage_Practice obj = new LoginPage_Practice("veena@gmail.com","admin@123");
		
		//calling the login method
		obj.loginToApplication();
		
		//change the password
		
		obj.setPassword("veena@123");
		obj.loginToApplication();

	}

}
