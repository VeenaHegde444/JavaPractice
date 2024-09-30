package javaBasicsPractice;

public class ArraysInsertion_Practice {

	public static void main(String[] args) {
		int arr[] = new int[6];
		int length=0;
		
		for(int i=0;i<3;i++) {
			arr[length] = i;
			length++;
		}
		//insert new element at the end of the array
		
		arr[length]=10;
		length++;
		
	/*	for(int i=0;i<arr.length;i++) {
			System.out.println("Index "+i+" contains "+arr[i]);
		}
	*/	
		//inserting element at the beginning of the array
		
		for(int i=3;i>=0;i--) {
			arr[i+1]=arr[i];
		}
		
		arr[0]=20;
		
	/*	for(int i=0;i<arr.length;i++) {
			System.out.println("Index "+i+" contains "+arr[i]);
		}
	*/	
		//inserting anywhere in the array
		
		for(int i=4;i>=2;i--) {
			arr[i+1]=arr[i];
		}

		arr[2] = 30;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Index "+i+" contains "+arr[i]);
		}
	}

}
