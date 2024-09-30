package encapsulation;

public class LoginPage_Practice {
	
	private String userName;
	private String password;
	
	//public constructor
	
	public LoginPage_Practice(String userName, String password) {
		this.userName=userName;
		this.password=password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void loginToApplication() {
		System.out.println("Enter username:"+ getUserName());
		System.out.println("Enter password:"+ getPassword());
	}
	

}
