package wrapperClass_Practice;

import java.util.ArrayList;
import java.util.List;

public class SumOfOddNumbers {
	
	public static int sumOfOddNumbers(List<Integer> list) {
		int sum = 0;
		
		for(Integer e : list) {
			if(e%2 != 0) {
				sum+=e;			
			}
			if(e.intValue() % 2 != 0 ) {
				sum += e.intValue();
			}
			
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		
		int sumOfOdd =  sumOfOddNumbers(list);
		System.out.println(sumOfOdd);

	}

}
