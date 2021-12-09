package com.sarkar.dsa.algo.dp;

public class KnapSack {

	static int[][] T;

	public static void main(String[] args) {

		int[] w = { 10, 20, 30 };
		int[] v = { 60, 100, 120 };
		int capacity = 50;

		// initializeGlobalTable(w.length, capacity);

		System.out.println(knapSackTopDown(w, v, capacity, w.length));

	}

	private static void initializeGlobalTable(int length, int capacity) {
		T = new int[length + 2][capacity + 2];
		for (int i = 0; i < length + 2; i++) {
			for (int j = 0; j < capacity + 2; j++) {
				T[i][j] = -1;
			}
		}
	}

	// 0-1 KnapSack
	private static int findMaximumProfit(int[] weight, int[] value, int capacity, int length) {

		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (weight[length - 1] <= capacity) {
			return Math.max(
					value[length - 1] + findMaximumProfit(weight, value, capacity - weight[length - 1], length - 1),
					findMaximumProfit(weight, value, capacity, length - 1));
		}

		// if weight[length - 1] > capacity
		return findMaximumProfit(weight, value, capacity, length - 1);

	}

	// 0-1 KnapSack - Memorization
	private static int findMaximumProfitUsingDP(int[] weight, int[] value, int capacity, int length) {

		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (T[length][capacity] != -1) {
			return T[length][capacity];
		}

		if (weight[length - 1] <= capacity) {
			return T[length][capacity] = Math.max(
					value[length - 1]
							+ findMaximumProfitUsingDP(weight, value, capacity - weight[length - 1], length - 1),
					findMaximumProfitUsingDP(weight, value, capacity, length - 1));
		}

		// if weight[length - 1] > capacity
		return T[length][capacity] = findMaximumProfitUsingDP(weight, value, capacity, length - 1);

	}

	// 0-1 KnapSack - Top Down Approach
	private static int knapSackTopDown(int[] weight, int[] value, int capacity, int length) {
		int[][] K = new int[length + 1][capacity + 1];
		for (int i = 0; i <= length; i++) {
			for (int j = 0; j <= capacity; j++) {
				if (i == 0 || j == 0) {
					K[i][j] = 0;
				} else if (weight[i - 1] <= j) {
					K[i][j] = Math.max(value[i - 1] + K[i - 1][j - weight[i - 1]], K[i - 1][j]);
				} else {
					K[i][j] = K[i - 1][j];
				}
			}
		}
		return K[length][capacity];
	}

}
