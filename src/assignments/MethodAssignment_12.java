package assignments;
/*Method with Return Value (double) and with Parameters (double[]):

Assignment: Write a method to calculate the average of elements in a double array and return the result.

Signature: public double calculateAverage(double[] numbers)

 */
public class MethodAssignment_12 {
	
	//Formula for average = sum of all numbers / no. of all elements
	public static double calculateAverage(double[] numbers) {
		double sum = 0.0;
		for(double e: numbers) {
			sum = sum+e;
		}
		
		return sum/numbers.length;
		
	}

	public static void main(String[] args) {
		double[] d = {1.2,1.3,1.4,1.5};
		double average = calculateAverage(d);
		System.out.println(average); // 1.2+1.3+1.4+1.5=5.4/4=1.35

	}

}
