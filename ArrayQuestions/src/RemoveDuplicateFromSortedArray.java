
public class RemoveDuplicateFromSortedArray {
	
	public static void removeDuplicate(int arr[]) {
		int j =0;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,3,5,6,6,9,10};
		
		removeDuplicate(arr);
		
	}

}
