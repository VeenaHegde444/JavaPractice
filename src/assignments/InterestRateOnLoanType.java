package assignments;

/*WAP to define the interest rate on the basis of Loan type using Switch Case

Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan

For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan
 * 
 */
public class InterestRateOnLoanType {

	public static void main(String[] args) {
		String loanType = "Housing Loan";
		double salary = 30000;
		double interestRate = 0.0;
		
		switch (loanType) {
		case "Car Loan":
			interestRate = 6.5;
			break;
		case "Housing Loan":
			if(salary< 35000) {
				System.out.println("Not applicable for Housing Loan");
				break;
			}
			interestRate = 7.5;
			break;
			
		case "Personal Loan":
			interestRate = 10.0;
			break;
		case "Education Loan":
			interestRate = 8.0;
			break;

		default:
			System.out.println("Invalid loan type");
			break;
		}
		System.out.println("Interest rate for "+loanType+" is "+ interestRate +"%");

	}

}
