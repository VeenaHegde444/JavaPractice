package arrayPrograms;
//Given an array nums of integers, return how many of them contain an even number of digits.
public class FindNumWithEvenNoOfDigits {
	
	public static int findNumbers(int nums[]) {
/*		int count=0;
		if(nums.length !=0) {
			String strNum;
			for(int i=0;i<nums.length;i++) {
				strNum =Integer.toString(nums[i]);
				if(strNum.length() % 2 ==0) {
					count++;
				}
			}
		}
		return count;
		
	}		
		
*/		
		int count = 0;		
			for(int i=0;i<nums.length;i++) {
				int digits =0;
				while (nums[i] !=0) {
					nums[i]=nums[i]/10;
					digits++;
				}
				if(digits%2 == 0) {
					count++;
				}
			}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {12,36,2,6,786};
		int ans = findNumbers(nums);
		System.out.println("Even no. of digits are:"+ans);

	}

}
