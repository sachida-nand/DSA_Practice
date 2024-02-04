
public class DeleteAnElementFromArray {
	
	public static void deleteElementInArray(int arr[], int key) {
		if(arr.length < 0) System.out.println("Given array is empty");
		int i = 0;
		for (i = 0; i < arr.length; i++) {
			if(arr[i] == key) {
				break;
			}
		}
		
		for (int j = i; j < arr.length -1; j++) {
			arr[j] = arr[j+1];
		}
		
	}
	
	public static void displayArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,8,9,2,3,7};
		deleteElementInArray(arr, 12);
		displayArray(arr);
		
	}

}
