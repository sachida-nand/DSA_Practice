
public class LongLengthOfAllconsecutive {
	
	public static void longestLength(int arr[]) {
		
		int count = 0;
		int longestLength = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 1) count +=1;
			else count = 0;
			
			if(count> longestLength) longestLength = count;
		}
		
		System.out.println("Longest length: "+longestLength);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 1};
		
		longestLength(arr);
	}

}
