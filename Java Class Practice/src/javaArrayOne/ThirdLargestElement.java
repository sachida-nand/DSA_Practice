package javaArrayOne;

public class ThirdLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,10,5,40,7,8,9};
		
		int thirdMax = FindThirdLargetElement(arr);
		
		System.out.print("Third larget element is "+thirdMax);
		

	}
	
	public static int FindThirdLargetElement(int[] arr) {
		int max = arr[0];
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
	
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				thirdMax = secondMax;
				secondMax = max;
				max = arr[i];
			}else if( arr[i] > secondMax) {
				thirdMax = secondMax;
				secondMax = arr[i];
			}else if(arr[i] > thirdMax) {
				thirdMax = arr[i];
			}
		}
		return thirdMax;
	}

}
