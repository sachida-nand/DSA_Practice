package ArraySecondClass;

public class ArraySecond {
	
	public static int laderInArray(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
			return 0;
		}
		
		
		int larger = Integer.MIN_VALUE;
		int arr2[] = new int[arr.length];
		int j = 0;
		
		for (int i = arr.length - 1; i >=0; i--) {
			if(arr[i] > larger) {
				larger = arr[i];
				arr2[j] = larger;
				j++;
			}			
		}
		
		for (int i = j - 1; i >= 0; i--) {
			System.out.print(" " + arr2[i]);
		}
				
		return 1;
	}
	
	public static void maximumSumSubArray(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int currentSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int startIndex = 0;
		int endIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			currentSum += arr[i];
			
			if(currentSum <= -1) {
				startIndex = i + 1;
				currentSum = 0;
			}
			
			if(currentSum > maxSum) {
				maxSum = currentSum;
				endIndex = i;
			}
		}
		
		System.out.println("maximum sum is "+ maxSum);
		System.out.println("Start index "+ startIndex);
		System.out.println("End index "+ endIndex);

	}
	
	public static void minimumSumSubArray(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int currentSum = -1;
		int minSum = Integer.MAX_VALUE;
		int startIndex = 0;
		int endIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			
			if(currentSum > 0) {
				startIndex = i + 1;
				currentSum = arr[i];
			}else {
				currentSum += arr[i];
			}
			
//			minSum = Math.min(minSum, currentSum);
			
			if(currentSum < minSum) {
				minSum = currentSum;
				endIndex = i;
			}
		}
		
		System.out.println("minimum sum is "+ minSum);
		System.out.println("Start index "+ startIndex);
		System.out.println("End index "+ endIndex);

	}
	
	public static void containerWithMostWater(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int maxWater = Integer.MIN_VALUE;
		int currentWatter = 0;
		int startIndex = 0;
		int endIndex = 0;
		
//		for (int i = 0; i < arr.length; i++) {
//			int left = arr[i];
//			for (int j = i+1; j < arr.length; j++) {
//				int right = arr[j];
//				
//				int distance = j - i;
//				int Area = Math.min(left, right) * distance;
//				
//				maxWater = Math.max(Area, maxWater);
//			}
//		}
		
		int finalLength = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			int left = arr[i];
			int right = arr[finalLength - 1];
			
			int distance = (finalLength - 1) - i;
			
			int area = Math.min(left, right) * distance;
			maxWater = Math.max(area, maxWater);
		}
		
		System.out.println("max watter is "+maxWater);
		System.out.println("start Index is "+startIndex);
		System.out.println("end index is "+endIndex);
	}
	
	public static void trappingRainWaterProblem(int arr[]) {
		int len = arr.length;
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int rightLadder[] = new int[len];
		int leftLadder[] = new int[len];
		int rightMax = Integer.MIN_VALUE;
		int leftMax = Integer.MIN_VALUE;
		int maxWater = 0;
		
		for (int i = 0; i < len -1; i++) {
			if(arr[i] > rightMax) {
				rightMax = arr[i];
			}
			rightLadder[i] = rightMax;
		}
		
		for (int i = len -1; i >= 0; i--) {
			if(arr[i] > leftMax) {
				leftMax = arr[i];
			}
			leftLadder[i] = leftMax;
		}
		
		for (int i = 0; i < len -1; i++) {
			maxWater += Math.min(leftLadder[i], rightLadder[i]) - arr[i];
		}
		
		System.out.println("maximum water is "+maxWater);
	}
	
	public static void frequencyOfEllementsInArray(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int count = 1;
		int previous = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != previous) {
				System.out.println("the frequency of " + previous + " is " + count);
				count = 1;
				previous = arr[i];
			}else {
				++count;
			}
		}
		
		System.out.println("the frequency of " + previous + " is " + count);
	}
	
	public static void longestLengthOfAllConsecutive(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int longetstLength = 0;
		int count = 1;
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] == arr[i -1]) {
				count++;
			}else {
				count = 1;
			}
			
			if(count > longetstLength) {
				longetstLength = count;
			}
		}
		
		System.out.println("Longest consecutive is "+ longetstLength);
	}
	
	public static void moveAllZerroToEnd(int arr[]) {
		if(arr.length == 0) {
			System.out.println("Given array is empty");
		}
		
		int num = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] !=0) {
				int temp = arr[num];
				arr[num] = arr[i];
				arr[i] = temp;
				num++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+ arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {2,7,6,1,4,3};
		int arr[] = {16, 17, 4, 3, 5, 2};
//		int maxSumArr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int maxSumArr[] = { 6, 7, 4, -2, 1, 5, -4};
		int containerArr[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7};
//		int containerArr[] = {1, 5, 4, 3};
		
//		int rainWaterProblem[] = { 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int rainWaterProblem[]= {4,2,0,3,2,5};
		
//		int frequencyArr[] = {2, 2, 6, 6, 7, 7, 7, 11};
		int frequencyArr[] = {1,1,1,0,0,1,0,1,1,1,1,0,1};
		int moveZero[] = {8,0,1,3,0,0,5};
		int minimumSum[] = {3, -4, 2, -3, -1, 7, -5};

//		laderInArray(arr);
//		maximumSumSubArray(maxSumArr);
//		containerWithMostWater(containerArr);
//		trappingRainWaterProblem(rainWaterProblem);
//		frequencyOfEllementsInArray(frequencyArr);
//		longestLengthOfAllConsecutive(frequencyArr);
//		moveAllZerroToEnd(moveZero);
		minimumSumSubArray(minimumSum);
	}

}
