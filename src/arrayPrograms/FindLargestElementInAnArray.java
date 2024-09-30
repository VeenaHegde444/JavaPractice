package arrayPrograms;
//Find the largest element in an given array
public class FindLargestElementInAnArray {
	
	static int arr[] = {10,56,10,20,99,5,18};
	
	static int largest() {
		
		int max = arr[0];
		
		for (int i = 1;i<arr.length;i++){
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("Largest element in an given array is: "+largest());	

	}

}
