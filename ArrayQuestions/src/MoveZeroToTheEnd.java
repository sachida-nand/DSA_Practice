
public class MoveZeroToTheEnd {
	
	public static void moveZero(int arr[]) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = 0;
				arr[j] = temp;
				j++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {8, 0, 1, 3, 0, 0, 5};
		
		moveZero(arr);
	}

}
