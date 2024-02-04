
public class SmallestElementInArray {
	
	public static void findSmallestE(int array[]) {
		int smallest = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		
		System.out.println("Smallest Element is: "+smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,9,-6,8,3,6};
		findSmallestE(arr);
	}

}
