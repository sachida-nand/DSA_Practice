package javaArrayOne;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		
		reverseArray(arr,n);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static int reverseArray(int[] arr, int n) {
		int start = 0;
		int end = n -1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		return 1;
	}
}
