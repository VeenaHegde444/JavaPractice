package assignments;

public class Encapsulation_Assgn2_BankAccount {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.setOwner("Veena");
		ba.setAccountNumber("123-456-789");
		ba.setBalance(12000.00);
		
		ba.deposit(100.10);
		ba.withdraw(200.10);
		
		ba.printStatement();
		
		

	}

}
