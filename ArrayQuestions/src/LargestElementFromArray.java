
public class LargestElementFromArray {
	
	public static void findLargestElement(int arr[]) {
		int n = arr.length;
		if(n < 0) System.out.println("Given array is empty");
		
		int largest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		System.out.println("Largest element is: "+ largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56,6,8,9,7,1,3,10};
		
		findLargestElement(arr);
	}

}
