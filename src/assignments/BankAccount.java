package assignments;
/*Assignment 2:

Objective: The objective of this assignment is to create a class that uses encapsulation to hide its implementation details and provide a simple interface for clients.

Instructions:

Create a class called "BankAccount" with the following private attributes: accountNumber (String), balance (double), and owner (String).

Create getter and setter methods for each attribute.

Write a method called "deposit" that takes a double parameter and adds it to the balance.

Write a method called "withdraw" that takes a double parameter and subtracts it from the balance.

Write a method called "printStatement" that prints out the account number, owner name, and balance.

Create an instance of the "BankAccount" class and set its attributes using the setter methods.

Call the "deposit" and "withdraw" methods to modify the balance of the account.

Call the "printStatement" method to verify that the data was set correctly.

Questions:

How can encapsulation be used to hide implementation details from user of a class?

What are the benefits of using private attributes in a class?

What is the difference between a getter method and a setter method?

How can encapsulation improve the readability of code?
 * 
 * 
 */
public class BankAccount {
	
	private String accountNumber;
	private double balance;
	private String owner;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void deposit(double amount) {
		 balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void printStatement() {
		System.out.println("Owner name is: "+owner);
		System.out.println("Account number is: "+accountNumber);
		System.out.println("Balance is: "+balance);
	}

}
