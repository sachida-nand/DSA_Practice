
public class MaximumSumSubArray {
	
	public static void maximumSumSubArray(int arr[], int n) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		int start = 0;
		int end = 0;
		int temp = 0;
		
		for (int i = 0; i < n; i++) {
			
			sum += arr[i];
			
			if(sum < 0) {
				sum = 0;
				temp = i + 1;
			}
			
			if(maxSum < sum) {
				maxSum = sum;
				start = temp;
				end = i;
			}	
		}
		
		System.out.println("Maximum Sum is "+maxSum);
		System.out.println("Start index is: "+ start);
		System.out.println("End Index is: "+end);
		System.out.print("Maximum Sum Sub Array Element: ");
		
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		maximumSumSubArray(arr, arr.length);
	}

}
