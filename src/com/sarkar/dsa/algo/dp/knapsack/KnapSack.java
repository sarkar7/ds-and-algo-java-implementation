package com.sarkar.dsa.algo.dp.knapsack;

public class KnapSack {

	static int[][] T;

	public static void main(String[] args) {

		int[] w = { 10, 20, 30 };
		int[] v = { 60, 100, 120 };
		int capacity = 50;

		// Recursive Brute Force
		System.out.println(findMaximumProfit(w, v, capacity, w.length));

		// DP - Recursive Memorization - Top Down
		initializeGlobalTable(w.length, capacity);
		System.out.println(findMaximumProfitUsingMemorization(w, v, capacity, w.length));

		// 0-1 KnapSack - Bottom Up Approach
		System.out.println(findMaximumProfitUsingBottomUp(w, v, capacity, w.length));

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
	 * @param weight
	 * @param value
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(2^N) Space Complexity - O(1)
	 * 
	 */

	private static int findMaximumProfit(int[] weight, int[] value, int capacity, int length) {

		// if length is zero then return zero
		// or if the capacity is zero then return zero
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

	/**
	 * 
	 * 0-1 KnapSack - DP - Recursive Memorization
	 * 
	 * @param weight
	 * @param value
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(length * capacity) Space Complexity - O(length *
	 *         capacity)
	 * 
	 */
	private static int findMaximumProfitUsingMemorization(int[] weight, int[] value, int capacity, int length) {

		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (T[length][capacity] != -1) {
			return T[length][capacity];
		}

		if (weight[length - 1] <= capacity) {
			return T[length][capacity] = Math.max(value[length - 1]
					+ findMaximumProfitUsingMemorization(weight, value, capacity - weight[length - 1], length - 1),
					findMaximumProfitUsingMemorization(weight, value, capacity, length - 1));
		}

		// if weight[length - 1] > capacity
		return T[length][capacity] = findMaximumProfitUsingMemorization(weight, value, capacity, length - 1);

	}

	/**
	 * 
	 * 0-1 KnapSack - DP - Bottom Up Approach
	 * 
	 * @param weight
	 * @param value
	 * @param capacity
	 * @param length
	 * @return
	 * 
	 *         Time Complexity - O(length * capacity) Space Complexity - O(length *
	 *         capacity)
	 * 
	 */
	private static int findMaximumProfitUsingBottomUp(int[] weight, int[] value, int capacity, int length) {
		int[][] K = new int[length + 1][capacity + 1];
		for (int i = 0; i <= length; i++) {
			for (int j = 0; j <= capacity; j++) {

				// Initializing the K matrix by setting elements of first row and first column zero
				// This is the alternative of base condition
				if (i == 0 || j == 0) {
					K[i][j] = 0;
				}

				else if (weight[i - 1] <= j) {
					K[i][j] = Math.max(value[i - 1] + K[i - 1][j - weight[i - 1]], K[i - 1][j]);
				} else {
					K[i][j] = K[i - 1][j];
				}
			}
		}
		return K[length][capacity];
	}

}
