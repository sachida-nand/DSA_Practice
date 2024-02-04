import java.util.Arrays;

public class TwoNumberWithGivenSum {
	
	public static void finTwoNumberWithGivenSum(int arr[], int sum) {
		
		int l =0;
		int r = arr.length -1;
		int num1 = 0;
		int num2 = 0;
		boolean sumFound = false;
		
		Arrays.sort(arr);
		
		while (l < r) {
			int currentSum = arr[l] + arr[r];
			
			if(currentSum == sum) {
				num1 = arr[l];
				num2 = arr[r];
				sumFound = true;
				break;
			}else if(currentSum > sum ) {
				r--;
			}else {
				l++;
			}
		}
		
		if(sumFound == true) {
			System.out.println("Sum fount at "+num1+ " and "+num2);
		}else {
			System.out.println("Sum not found in given array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 4, 45, 6, 10, 8};
		
		finTwoNumberWithGivenSum(arr, 16);
	}

}
