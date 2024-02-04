package ArrayFirstClass;

import java.sql.Time;

public class Array {
	
	public static int deleteElement(int arr[], int key) {
		int res = -1;
		if(arr.length == 0) return 0;
		
		for(int i=0; i < arr.length - 1; i++) {
			if(arr[i] == key) {
				res = 1;
			}
			
			if(res == 1) {
				arr[i] = arr[i+1];
			}
		}
		
		return 1;
	}
	
	public static int findLargestElement(int arr[]) {
		
		if(arr.length == 0) {
			System.out.println("given array is empty");
			return -1;
		}
		int maxElement = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxElement) {
				maxElement = arr[i];
			}
		}
		
		System.out.println("max element is "+ maxElement);
		return 1;
	}
	
	public static int secondLargestEle(int arr[]) {
		if(arr.length == 0) {
			System.out.println("given array is empty");
			return -1;
		}
		
		int max = 1;
		int secondMax = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				secondMax = max;
				max = arr[i];
			}
			
			if(arr[i] > secondMax && arr[i] < max) {
				secondMax = arr[i];
			}
		}
		
		System.out.println("second largest element is "+ secondMax);
		return 1;
	}
	
	public static int remveDuplicateFromArray(int arr[]) {
		if(arr.length ==0) return 0;
		int j=0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[j]) {
				arr[j+1] = arr[i];
				j++;				
			}
		}
		
		return 1;
	}
	
	public static int findSmallestElement(int arr[]) {
		if (arr.length == 0) return 0;
		
		int smallest = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		
		System.out.println("smallest element of the array is "+ smallest);
		return 1;
	}
	
	public static int findThirdlargestElement(int arr[]) {
		
		if(arr.length ==0) {
			System.out.println("Given array is empty");
			return 0;
		}
		
		int largest = 1;
		int secondLargest = 0;
		int thirdLargest = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				thirdLargest = secondLargest;
				secondLargest = largest;
				largest = arr[i];
			}
			
			if(arr[i] < largest && arr[i] > secondLargest) {
				thirdLargest = secondLargest;
				secondLargest = arr[i];
			}
		}
		
		System.out.println("third largest element is " + thirdLargest);
		return 1;
		
	}
	
	public static int checkArrayIsSorted(int arr[]) {
		if(arr.length ==0) {
			System.out.println("Given array is empty");
			return 0;
		}
		
		Boolean isSorted = true;
		
		for (int i = 1; i < arr.length; i++) {
			
//			if(arr[i - 1] <= arr[i] || arr[i-1] >= arr[i]) {
//				isSorted = true;
//			}else {
//				isSorted = false;
//				break;
//			}
			
			if(arr[i - 1] > arr[i]) {
				isSorted = false;
				break;
			}
		}
		
		if(isSorted) {
			System.out.println("Array is sorted");
			return 1;
		}else {
			System.out.println("Array is not sorted");
			return 1;
		}
	}
	
	public static int reveseTheArray(int arr[]) {
		if(arr.length ==0) {
			System.out.println("Given array is empty");
			return 0;
		}
		
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			int temp = arr[arr.length - i -1];
			arr[arr.length - i - 1] = arr[i];
			arr[i] = temp; 
			
//			System.out.print(" "+ (arr[arr.length - i - 1]));
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
		
		return 1;
		
	}
	
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
		// TODO Auto-generated method stub
//		int arr[] = {6,15,9,3,2,16,9};
//		int arr[] = {1,6,9,8,-2,-6,6,9};
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		int arr[] = {10,9,15,7,6,5,4,3,2,1};
		int arr[] = {7,5,8,9,6,8,5,7,4,6};
		


//		int key = 1;
		
//		deleteElement(arr, key);
//		findLargestElement(arr);
//		secondLargestEle(arr);
//		remveDuplicateFromArray(arr);
//		findSmallestElement(arr);
		
//		findThirdlargestElement(arr);
//		checkArrayIsSorted(arr);
//		reveseTheArray(arr);
		replaceElementOfItsGretest(arr);
		
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
	}

}
