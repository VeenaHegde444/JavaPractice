package assignments;

/*WAP to book the specific type of car from the Uber app using Switch - Case. 

Car Type: Mini, Sedan, SUV, Premium

If user passes wrong car type, print please select the right car type

 */
public class UberCarType {

	public static void main(String[] args) {
		String carType = "Honda";
		
		switch (carType) {
		case "Mini":
			System.out.println("Selected car is Mini");			
			break;
		case "Sedan":
			System.out.println("Selected car is Sedan");			
			break;

		case "SUV":
			System.out.println("Selected car is SUV");			
			break;

		case "Premium":
			System.out.println("Selected car is Premium");			
			break;

		default:
			System.out.println("Please select the correct car type: "+carType);
			break;
		}

	}

}
