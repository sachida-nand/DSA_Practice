import java.util.Iterator;

public class ThirdLargestInArray {
	
	public static void findThirdLargest(int arr[]) {
		int fLargest = 0;
		int sLargest = 0;
		int tlargest = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > fLargest) {
				tlargest = sLargest;
				sLargest = fLargest;
				fLargest = arr[i];
			}else if(arr[i] > sLargest) {
				tlargest = sLargest;
				sLargest = arr[i];
			}
			else if(arr[i] > tlargest) {
				tlargest = arr[i];
			}
		}
		
		System.out.println("Third largest is: "+ tlargest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,2,3,6,8,99,7,55};
		
		findThirdLargest(arr);
	}

}
