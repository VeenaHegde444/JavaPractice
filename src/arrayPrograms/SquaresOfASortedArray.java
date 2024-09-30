package arrayPrograms;
//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
public class SquaresOfASortedArray {
	
public static int[] sortedSquares(int[] nums) {
        
        int n=nums.length;
        int[] squarredArray=new int[n];
        int highestSquareIndex=n-1;
        
        int left=0;
        int right=n-1;
        
        while (left <= right){
            
            int leftSquare=nums[left]*nums[left];
            int rightSquare=nums[right]*nums[right];
            
            if(leftSquare>rightSquare){
                squarredArray[highestSquareIndex--] = leftSquare;
                left++;
            }
            else{
                squarredArray[highestSquareIndex--] = rightSquare;
                right--;
            }
        }
        return squarredArray;
        
    }

	public static void main(String[] args) {
        int nums[]={-4,-1,0,3,10};
        int squArray[]=sortedSquares(nums);
        for(int i=0;i<squArray.length;i++){
            System.out.print(squArray[i]+ " ");
        }
        System.out.println();

	}

}
