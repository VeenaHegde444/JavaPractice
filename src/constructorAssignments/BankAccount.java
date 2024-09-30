package constructorAssignments;
/*Create a Java class named "BankAccount" with the following instance variables:

accountNumber (String)

balance (double)

Create a constructor for the BankAccount class that takes in the accountNumber and balance as parameters and initializes the instance variables.

Create a method in the BankAccount class named "deposit" that takes in a double value as a parameter and adds it to the balance instance variable.

Create a method in the BankAccount class named "withdraw" that takes in a double value as a parameter and subtracts it from the balance instance variable.

Create a main method that creates an instance of the BankAccount class using the constructor and performs multiple deposits and withdrawals using the 
deposit and withdraw methods. Print out the updated balance after each transaction.
 * 
 * 
 * 
 * 
 */
public class BankAccount {
	
	//instance variables
	
	String accountNumber;
	double balance;
	
	//constructor
	
	public BankAccount(String accountNumber, double balance) {
		this.accountNumber=accountNumber;
		this.balance=balance;
	}

	
	public double deposit(double value) {
		return balance +=value;	
	}
	
	public double withdraw(double value) {
		return balance -=value;
		
	}
}
