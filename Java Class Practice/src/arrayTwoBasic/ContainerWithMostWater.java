package arrayTwoBasic;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		int[] arr = {1,8,6,2,5,4,8,3,7};
		int maxArea = findContainerWithMostWater(arr);
		System.out.print("Max Water cotainer is "+maxArea);
	}
	
	public static int findContainerWithMostWater(int[] arr) {
		int maxArea = 0;
		int l=0;
		int r = arr.length -1;
		
		while(l < r) {
			int height = Math.min(arr[l], arr[r]);
			int distance = r - l;
			int area = height * distance;
			maxArea = Math.max(maxArea, area);
			
			if(arr[l] < arr[r]) {
				l++;
			}else {
				r--;
			}
		}
		return maxArea;
	}
}
