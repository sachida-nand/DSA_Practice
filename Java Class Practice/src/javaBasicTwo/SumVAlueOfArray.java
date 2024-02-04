package javaBasicTwo;

public class SumVAlueOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5};
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of the array is "+sum);
	}

}
