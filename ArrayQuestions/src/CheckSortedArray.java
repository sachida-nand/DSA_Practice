
public class CheckSortedArray {
	
	public static void checkSortedArray(int arr[]) {
		boolean check = false;
		for (int i = 0; i < arr.length -1; i++) {
			if(arr[i] > arr[i + 1]) {
				check = true;
				break;
			}
		}
		
		if(check == true) {
			System.out.println("Array is not sorted");
		}else {
			System.out.println("Array is sorted");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,60,555};
		
		checkSortedArray(arr);
	}

}
