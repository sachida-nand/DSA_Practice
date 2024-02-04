
public class SecondLargest {
	
	public static void findSecondLargest(int arr[]) {
		int firstLargest = 0;
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]> firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}else if(arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println("Second largest is: "+ secondLargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {56,6,8,96,7,1,3,10};
		
		findSecondLargest(arr);
	}

}
