package javaBasicsPractice;

public class ArraysDeletion_Practice {

	public static void main(String[] args) {
		int arr[] = new int[10];
		int length = 0;
		
		//add elements at the first 6 elements
		
		for(int i=0;i<6;i++) {
			arr[length]=i;
			length++;
		}
		length--;
		
		for(int i=0;i<length;i++) {
			System.out.println("Index "+i+" contains "+arr[i]);
		}

	}

}
