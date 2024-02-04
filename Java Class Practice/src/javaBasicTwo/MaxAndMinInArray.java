package javaBasicTwo;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,-2,-3,400,-5,-6};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		System.out.println("Maximum value is "+max);
		System.out.println("Minimum value is "+min);
	}

}
