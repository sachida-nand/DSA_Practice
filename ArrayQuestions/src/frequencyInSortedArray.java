
public class frequencyInSortedArray {
	
	public static void printFrequency(int arr[]) {
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i - 1] == arr[i]) {
				count += 1;
			}else {
				System.out.println("Frequency of "+ (arr[i - 1]) + " is "+ count);
				count = 1;
			}
		}
		
		System.out.println("Frequency of "+ (arr[arr.length -1 ]) + " is "+ count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
		
		printFrequency(arr);
	}

}
