package constructorAssignments;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount bnk = new BankAccount("123456",1000);
		//deposit 1000
		System.out.println(bnk.deposit(1000));
		//withdraw 100
		System.out.println(bnk.withdraw(100));
		
		//deposit 2000
		System.out.println(bnk.deposit(2000));
		//withdraw 1000
		System.out.println(bnk.withdraw(1000));
		
		//deposit 600
		System.out.println(bnk.deposit(600));
		//withdraw 2000
		System.out.println(bnk.withdraw(2000));
		

	}

}
