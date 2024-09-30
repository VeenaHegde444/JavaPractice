package arrayPrograms;

//Given a binary array nums, return the maximum number of consecutive 1's in the array
public class ReturnMaxConsecutiveOnes {
	
	public static int findMaxConsecutiveOnes(int nums[]) {
		
		int count = 0;
		int max_count=0;
		
		for(int i =0;i<nums.length;i++) {
			if(nums[i] == 1) {
				count++;
			}
			else {
				count=0;
			}
			max_count = Math.max(max_count, count);
		}
		return max_count;
	}

	public static void main(String[] args) {
		 int nums[] = {1,1,0,1,1,1};
		 int ans = findMaxConsecutiveOnes(nums);
		 System.out.println("The maximum consecutive one's is:" +ans);
		
		
	}

}
