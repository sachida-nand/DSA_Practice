package javaArrayOne;
import java.util.Scanner;

public class JavaArrayClassPractice {

	public static void main(String[] args) {
//		int[] arr = new int[6];
		
//		int[] arr = {80,2,3,50,500,6,7,81,90};
		int[] arr = {2,2,3,4,4,7,7,7,7};
		
//		findKeyFromArray(arr);
//		deleteKeyFromArray(arr);
//		findLargestElement(arr);
//		findSecondLargestElement(arr);
		int len = removeDupicateFromSortedArray(arr);
		displayArray(arr,len);
		
	}
	
	public static int removeDupicateFromSortedArray(int[] arr) {
		if(arr.length == 0) return 0;
		
		int j = 0;
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		return j+1;
	}
	
	public static void displayArray(int[] arr,int len) {
		if(len ==0) {
			System.out.println("your array is empty");
			return;
		}
		
		for(int i=0; i<len; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void findSecondLargestElement(int[] arr) {
		int max = 0;
		int secondMax = -1;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[max]) {
				secondMax = max;
				max = i;
			}else if(arr[i] < arr[max]) {
				if(secondMax == -1 || arr[i] > arr[secondMax]) {
					secondMax = i;
				}
			}
			
			
		}
		System.out.print("The second largest element is "+arr[secondMax]);
	}

	
	public static void findKeyFromArray(int[] array) {
		int key;
		int present = -1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements of the array");
		for(int i =0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.print("Enter a key for find present index: ");
		key = sc.nextInt();
		
		for(int i =0; i<array.length; i++) {
			if(array[i] == key) {
				present = i;
				break;
			}
		}
		
		if(present != -1) {
			System.out.println("Element found at index "+present);
		}else {
			System.out.println("Element not found in this array");
		}
	}
	
	public static void deleteKeyFromArray(int[] arr) {
		int key, i;
		int present = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a key to delete from the array: ");
		key = sc.nextInt();
		for(i=0; i<arr.length; i++) {
			if(arr[i] == key) {
				present = i;
				break;
			}
		}
				
		if(i == arr.length && present != arr.length -1) {
			System.out.print("Element not found in given array");
			return ;
		}
		
		if(present == arr.length - 1 ) {
			arr[present] = 0;
		}else {
			for(int j=i; j<arr.length-1; j++) {
				arr[j] = arr[j+1];
			}
		}
		
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void findLargestElement(int[] arr) {
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > arr[max]) {
				max = i;
			}
		}
		System.out.print("The largest element is "+arr[max]);
	}	
}

















