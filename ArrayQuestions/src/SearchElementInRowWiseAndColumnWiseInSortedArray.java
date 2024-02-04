import java.util.Iterator;

public class SearchElementInRowWiseAndColumnWiseInSortedArray {
	
	public static void searchAnElement(int arr[][], int k) {
		int n = arr.length;
		int found = -1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if(arr[i][j] == k) {
					found = 1;
					break;
				}else if (k > arr[i][j]) {
					break;
				}
			}
			
			if(found == 1 ) {
				break;
			}
		}
		
		if(found == 1) {
			System.out.println("Element found");
		}else {
			System.out.println("Element not found");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[][] = { 
//						{ 1, 4, 5, 7}, 
//						{ 2, 5, 6, 9 }, 
//						{ 6, 10, 11, 13 }, 
//						{ 8, 12, 15, 18 } 
//					};
		
		int arr[][] =  { {10, 20, 30, 40},
				   {15, 25, 35, 45},
				   {27, 29, 37, 48},
				   {32, 33, 39, 50}
				};
		searchAnElement(arr, 100);
	}

}
