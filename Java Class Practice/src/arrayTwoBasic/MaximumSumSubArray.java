package arrayTwoBasic;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-4,5,7,-6,10,-15,3};

		int maxSum = findMaximumSum(arr);
		
		System.out.print("Max sum of sub array is "+maxSum);
	}
	
	public static int findMaximumSum(int[] arr) {
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			currentSum += arr[i];
			if(currentSum > maxSum) maxSum = currentSum;
			if(currentSum < 0) currentSum = 0;
		}
		return maxSum;
		
	}

}
