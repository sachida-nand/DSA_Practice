package javaArrayOne;

public class ReplaceGretestItsRight {
	
	public static int replaceElementOfItsGretest(int arr[]) {
		if(arr.length ==0) {
			System.out.println("Given array is empty");
			return 0;
		}
		
//		Time O(n2)
		
//		for (int i = 0; i < arr.length; i++) {
//			int maxValue = 0;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[j] >= maxValue) {
//					maxValue = arr[j];
//				}
//			}
//			arr[i] = maxValue;
//		}
		
		int max = 0;
		
//		Time O(n) 
		for (int i = arr.length - 1; i >=0; i--) {
			int temp = max;
			if(arr[i] > max) {
				max  = arr[i];
			}
			arr[i] = temp;
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
			
		return 1;
		
	}


	public static void main(String[] args) {
		int arr[] = {7,5,8,9,6,8,5,7,4,6};
		replaceElementOfItsGretest(arr);
	}

}
