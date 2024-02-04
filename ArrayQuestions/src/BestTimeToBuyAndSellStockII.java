
public class BestTimeToBuyAndSellStockII {
	
	public static void bestTimeToBuyAndSell(int arr[]) {
		int profit = 0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > arr[i - 1]) {
				profit += arr[i] - arr[i -1];
			}
		}
		
		System.out.println("Total Profit is "+profit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,1,5,3,6,4};
		int arr1[] = {1,2,3,4,5};
		bestTimeToBuyAndSell(arr1);
	}

}
