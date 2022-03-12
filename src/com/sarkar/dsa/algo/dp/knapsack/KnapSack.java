package com.sarkar.dsa.algo.dp.knapsack;

public class KnapSack {

	static int[][] T;

	public static void main(String[] args) {

		int[] weights = { 10, 20, 30 };
		int[] profits = { 60, 100, 120 };
		int capacity = 50;

		// Recursive Brute Force
		System.out.println(findMaximumProfit(weights, profits, capacity, weights.length));

		// DP - Recursive Memorization - Top Down
		initializeGlobalTable(weights.length, capacity);
		System.out.println(findMaximumProfitUsingMemorization(weights, profits, capacity, weights.length));

		// 0-1 KnapSack - Bottom Up Approach
		System.out.println(findMaximumProfitUsingBottomUp(weights, profits, capacity, weights.length));

	}

	private static void initializeGlobalTable(int length, int capacity) {
		T = new int[length + 2][capacity + 2];
		for (int i = 0; i < length + 2; i++) {
			for (int j = 0; j < capacity + 2; j++) {
				T[i][j] = -1;
			}
		}
	}

	/**
	 * 
	 * 0-1 KnapSack - Recursive Bruit Force Approach
	 * 
	 * @param weights
	 * @param profits
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(2^N) Space Complexity - O(1)
	 * 
	 */

	private static int findMaximumProfit(int[] weights, int[] profits, int capacity, int length) {

		// if length is zero then return zero
		// or if the capacity is zero then return zero
		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (weights[length - 1] <= capacity) {
			return Math.max(
					profits[length - 1] + findMaximumProfit(weights, profits, capacity - weights[length - 1], length - 1),
					findMaximumProfit(weights, profits, capacity, length - 1));
		}

		// if weight[length - 1] > capacity
		return findMaximumProfit(weights, profits, capacity, length - 1);

	}

	/**
	 * 
	 * 0-1 KnapSack - DP - Recursive Memorization
	 * 
	 * @param weights
	 * @param profits
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(length * capacity) Space Complexity - O(length *
	 *         capacity)
	 * 
	 */
	private static int findMaximumProfitUsingMemorization(int[] weights, int[] profits, int capacity, int length) {

		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (T[length][capacity] != -1) {
			return T[length][capacity];
		}

		if (weights[length - 1] <= capacity) {
			return T[length][capacity] = Math.max(profits[length - 1]
					+ findMaximumProfitUsingMemorization(weights, profits, capacity - weights[length - 1], length - 1),
					findMaximumProfitUsingMemorization(weights, profits, capacity, length - 1));
		}

		// if weights[length - 1] > capacity
		return T[length][capacity] = findMaximumProfitUsingMemorization(weights, profits, capacity, length - 1);

	}

	/**
	 * 
	 * 0-1 KnapSack - DP - Bottom Up Approach
	 * 
	 * @param weights
	 * @param profits
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(length * capacity) Space Complexity - O(length * capacity)
	 * 
	 */
	private static int findMaximumProfitUsingBottomUp(int[] weights, int[] profits, int capacity, int length) {
		int[][] DP = new int[weights.length + 1][capacity + 1];
		for (int w = 0; w <= weights.length; w++) {
			for (int c = 0; c <= capacity; c++) {
				// Initializing the K matrix by setting elements of first row and first column zero
				// This is the alternative of base condition
				if (w == 0 || c == 0) {
					DP[w][c] = 0;
				}
				else if (weights[w - 1] <= c) {
					DP[w][c] = Math.max(profits[w - 1] + DP[w - 1][c - weights[w - 1]], DP[w - 1][c]);
				} else {
					DP[w][c] = DP[w - 1][c];
				}
			}
		}
		printSelectedElements(DP, weights, profits, capacity);
		return DP[length][capacity];
	}

	private static void printSelectedElements(int dp[][], int[] weights, int[] profits, int capacity) {
		System.out.print("Selected weights:");
		int totalProfit = dp[weights.length-1][capacity];
		for(int i=weights.length-1; i > 0; i--) {
			if(totalProfit != dp[i-1][capacity]) {
				System.out.print(" " + weights[i]);
				capacity -= weights[i];
				totalProfit -= profits[i];
			}
		}

		if(totalProfit != 0) {
			System.out.print(" " + weights[0]);
		}
		System.out.println("");
	}


}
