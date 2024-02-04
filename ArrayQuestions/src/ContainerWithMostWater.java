
public class ContainerWithMostWater {
	
	public static void containerWithMostWater(int arr[]) {
		int n = arr.length - 1;
		int left = 0;
		int right = n;
		int maxWater = 0;

		while(left < right) {
			
			int distance = right - left;				
			int minHight = Math.min(arr[right], arr[left]);
			
			int area = distance * minHight;
			
			if(area > maxWater) {
				maxWater = area;
			}
			
			if(arr[left] < arr[right]) {
				left ++;
			}else {
				right --;
			}
		}
		
		System.out.println("Max water is "+ maxWater);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,8,6,2,5,4,8,3,7};
		
		containerWithMostWater(arr);

	}

}
