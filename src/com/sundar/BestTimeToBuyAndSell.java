package com.sundar;

public class BestTimeToBuyAndSell {

	public static int maxProfit(int[] prices) {

		int max = 0;
		int left = 0;
		int right = prices.length - 1;

		while (left < right) {

			int value = prices[right] - prices[left];
			System.out.println(prices[right] + " " + prices[left]);
			max = Math.max(max, value);
			if (prices[left] > prices[right]) {
				left++;
			} else {
				right--;
			}
		}

		return max;
	}

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));

	}

}
