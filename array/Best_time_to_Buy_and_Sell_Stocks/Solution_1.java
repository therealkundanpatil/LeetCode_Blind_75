package array.Best_time_to_Buy_and_Sell_Stocks;

public class Solution_1 {
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int diff = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				diff = prices[j] - prices[i];
				if (diff > 0 && diff > maxProfit) {
					maxProfit = diff;
				}
			}
		}

		return maxProfit;
	}

	public static void main() {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}