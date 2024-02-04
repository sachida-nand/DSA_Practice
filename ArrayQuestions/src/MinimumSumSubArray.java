
public class MinimumSumSubArray {
	
	public static void minimumSumProblem(int arr[]) {
		int minSum = arr[0];
		int currentSum = arr[0];
		int startIndex = 0;
		int endIndex = 0;
		int temp = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(currentSum > 0) {
				currentSum = arr[i];
				temp = i;
			}else {
				currentSum += arr[i];
				
			}
			
			if(currentSum < minSum) {
				minSum = currentSum;
				startIndex = temp;
				endIndex = i;
			}
		}
		
		System.out.println("Minimum Sum Sub Array: "+ minSum);
		System.out.println("Start index: "+ startIndex);
		System.out.println("End Index: "+ endIndex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimumSum[] = {3, -4, 2, -3, -1, 7, -5};
		
		minimumSumProblem(minimumSum);
	}

}
