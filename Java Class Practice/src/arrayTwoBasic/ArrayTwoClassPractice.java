package arrayTwoBasic;

public class ArrayTwoClassPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,7,6,1,4,3};
		findLaders(arr);	
	}
	
	public static int findLaders(int[] arr) {
		int largest = Integer.MIN_VALUE;
		int[] secondArr = new int[arr.length];
		int j = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i] > largest) {
				largest = arr[i];
//				System.out.print(largest+" ");
				secondArr[j++] = arr[i];
			}
		}
		
//		System.out.print("\n");
		for(j = j-1; j>=0; j--) {
			System.out.print(secondArr[j]+" ");
		}
		

		return 1;
	}
		
}
