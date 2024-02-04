package javaArrayOne;

public class findTheSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,-8,9};
		
		int min = findSmallestElement(arr);
		System.out.print("Smallet element is "+min);
		
	}
	
	public static int findSmallestElement(int[] arr) {
		if(arr.length == 0) return -1;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <= min) {
				min = arr[i];
			}
		}
		return min;
	}

}
