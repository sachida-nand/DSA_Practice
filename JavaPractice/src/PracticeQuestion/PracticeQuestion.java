package PracticeQuestion;

import java.util.Scanner;
import java.util.Arrays;

public class PracticeQuestion {
	
	public static int[] takeArrayLengthAndElementFromuser() {
		System.out.println("Enter Length of the array: ");
		Scanner sc = new Scanner(System.in);
		int Length = sc.nextInt();
		int arr[] = new int[Length];
		
		System.out.println("Enter a Element of the Array");
		
		for(int i=0; i<arr.length; i++) {
			int ele = sc.nextInt();
			arr[i] = ele;
		}
		
		return arr;
	}
		
	public static boolean checkElementInArray(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter a key to search in array");
		int key = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) return true;
		}

		return false;
	}
	
	public static void sortAnArray(int arr[]) {
		int smallest = 0;
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] < arr[smallest]) {
				int temp = arr[i];
				arr[i] = arr[smallest];
				arr[smallest] = temp;
				smallest = i;
			}
			
			if(arr[i-1] > arr[i]) {
				int temp = arr[i-1];
				arr[i-1] = arr[i];
				arr[i] = temp;
			}
		
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" "+arr[i]);
		}
	}
	
	public static void productSumExceptSelf(int arr[]) {
		int n = arr.length;
		int prodArray[] = new int[n];
		
		for(int i =0; i < n; i++) {
			int prod = 1;
			for(int j=0; j<n; j++) {
				if(j != i) {
					prod *= arr[j];
				}
				prodArray[i] = prod;
			}
		}
		
		for (int i = 0; i < prodArray.length; i++) {
			System.out.print(" "+ prodArray[i]);
		}
	}

	public static int missingNumber(int arr[]) {
		int n = arr.length;
		int sum = (n*(n+1))/2;
		int res = 0;
		for (int i = 0; i < n; i++) {
			res += arr[i];
		}
		return sum - res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = takeArrayLengthAndElementFromuser();
//		displayArrayElement(arr);
//		Scanner sc = new Scanner(System.in);
//		
//		int check = 0;
//		
//		do {
//			System.out.println(checkElementInArray(arr));
//			
//			System.out.println("Enter 1 to Continue searching");
//			check = sc.nextInt();
//			
//		} while (check == 1);
		
		
//		int arr[] = {2,8,3,5,9,1};
//		sortAnArray(arr);
		
//		int arr[] = {1, 2, 3, 4};
//		productSumExceptSelf(arr);
		int arr[] = {3,0,1};
		
		System.out.println(missingNumber(arr)+ " is missing");
				
	}

}
