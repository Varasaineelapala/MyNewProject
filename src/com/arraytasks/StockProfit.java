package com.arraytasks;

public class StockProfit {
	static void check(int[] arr) {
		int minPrice = arr[0];
		int maxProfit = 0;
		int bp = 0;
		int sp = 0;
//		for (int i = 0; i <= arr.length - 1; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				int profit = arr[j] - arr[i];
//				if (maxProfit < profit) {
//					maxProfit = profit;
//					bp = arr[i];
//					sp = arr[j];
//				}
//			}
		for (int i = 1; i < arr.length; i++) {
			int currentProfit = arr[i] - minPrice;
			if (currentProfit > maxProfit) {
				maxProfit = currentProfit;
				bp = minPrice;
				sp = arr[i];
			}
			if (arr[i] < minPrice) {
				minPrice = arr[i];
			}
		}
		System.out.print("Best buying price : " + bp);
		System.out.print("\nBest Selling      : " + sp);
		System.out.print("\nMax Profit        : " + maxProfit);
	}

	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 6, 4 };
		check(arr);

	}

}
