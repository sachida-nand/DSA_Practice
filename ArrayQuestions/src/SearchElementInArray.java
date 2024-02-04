
public class SearchElementInArray {
	
	public static void searchElementInArray(int arr[], int key) {
		
		if(arr.length < 0) System.out.println("Given array is empty");
		int index = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			System.out.println("Element is found at index: "+ index);
		}else {
			System.out.println("Element is not found in given array");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,6,9,8,7};
		
		searchElementInArray(arr, 0);

	}

}
