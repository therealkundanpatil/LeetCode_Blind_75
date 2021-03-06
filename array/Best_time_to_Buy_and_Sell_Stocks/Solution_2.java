package array.Best_time_to_Buy_and_Sell_Stocks;

public class Solution_2 {
	public static int maxProfit(int[] prices) {
		int minimum = Integer.MAX_VALUE;
		int maximumProfit = 0;

		int length = prices.length;
		for (int i = 0; i < length; i++) {
			if (prices[i] < minimum) {
				minimum = prices[i];
			}
			if (prices[i] - minimum > maximumProfit) {
				maximumProfit = prices[i] - minimum;
			}
		}

		return maximumProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}