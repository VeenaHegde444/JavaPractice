package javaBasicsPractice;

public class ArrayFunction_Practice {
	
	int[] arr = new int[4];
	
	public int[] fillArray() {
		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
		}
		return arr;
		
	}
	
	public void printArray(int[] b) {
		for(int i=0;i<4;i++) {
			System.out.println(b[i]);
		}
	}

	public static void main(String[] args) {
		ArrayFunction_Practice obj = new ArrayFunction_Practice();
		int[] b =obj.fillArray();
		obj.printArray(b);

	}

}
