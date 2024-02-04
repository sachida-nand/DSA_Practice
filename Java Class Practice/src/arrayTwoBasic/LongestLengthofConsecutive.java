package arrayTwoBasic;

public class LongestLengthofConsecutive {
	
	public static int findLongestConsecutive(int[] a) {
		int n = a.length;
		int count = 0;
		int currentCount = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] == 1) {
				currentCount++;
				count = Math.max(currentCount, count);
			}else {
				currentCount = 0;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};	
		System.out.println(findLongestConsecutive(a));
	}

}
