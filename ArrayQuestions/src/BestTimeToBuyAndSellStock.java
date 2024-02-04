
public class BestTimeToBuyAndSellStock {
	
	public static void bestTimeToBuyAndSell(int prices[]) {
		int left = 0;
		int right = 1;
		int max_profit = 0;

		
		while (right < prices.length) {
			
			if(prices[left] < prices[right]) {
				int currentprofit = prices[right] - prices[left];
				max_profit = Math.max(max_profit, currentprofit);
			}else {
				left = right;
			}
			
			right++;
		
		}
		
		System.out.println("max profit: "+max_profit);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {7,6,4,3,1};
		int arr[] = {7,1,5,3,6,4};

		
		bestTimeToBuyAndSell(arr);
	}

}
