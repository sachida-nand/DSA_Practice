import java.util.Iterator;

public class ReplaceElementWithGretest {
	
	public static void replaceElementWithGretest(int arr[]) {
		int n = arr.length-1;
		int ladder = 0;
		for (int i = n; i >= 0; i--) {
			int temp = ladder;
			if(arr[i] > ladder) {
				ladder = arr[i];
			}
			arr[i] = temp;
			
//			if(i == n) {
//				ladder = arr[i];
//				arr[i] = 0;
//			}else {
//				if(arr[i] > ladder) {
//					int temp = arr[i];
//					arr[i] = ladder;
//					ladder = temp;	
//				}else {
//					arr[i] = ladder;
//				}
//			}
			
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,5,8,9,6,8,5,7,4,6};
		
		//9 9 9 8 8 7 7 6 6 0
		replaceElementWithGretest(arr);
	}

}
