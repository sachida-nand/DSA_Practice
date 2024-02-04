
public class SubArrayWithZeroSum {
	
	public static boolean findSubArrayWithZeroSum(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			int sum = arr[i];
			for (int j = i; j < arr.length -1 ; j++) {
				
				if(sum == 0) {
					return true;
				}
				
				sum += arr[j + 1];
			}
		}
		
		return false;
	}
	
	public static boolean findSubArrayUsingPrifixSum(int arr[]) {
		int prifix_sum[] = new int[arr.length];
		int sum = 0;
		for (int i = 0; i < prifix_sum.length; i++) {
			sum += arr[i];
			prifix_sum[i] = sum;
		}
		
		System.out.println("prifix sum");
		for (int i = 0; i < prifix_sum.length; i++) {
			System.out.print(prifix_sum[i]+ " ");
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 2, -3, 1, 6};
		int arr1[] = {-3, 2, 3, 1, 6};
		
//		System.out.println(findSubArrayWithZeroSum(arr1));
		findSubArrayUsingPrifixSum(arr1);
	}

}
