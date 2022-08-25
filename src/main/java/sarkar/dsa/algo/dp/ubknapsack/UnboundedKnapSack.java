package sarkar.dsa.algo.dp.ubknapsack;

public class UnboundedKnapSack {

	public static void main(String[] args) {

		int[] w = { 10, 20, 30 };
		int[] v = { 60, 100, 120 };
		int capacity = 50;

		// Recursive Brute Force
		System.out.println(findMaximumProfit(w, v, capacity, w.length));

	}

	private static int findMaximumProfit(int[] weight, int[] value, int capacity, int length) {

		// if length is zero then return zero
		// or if the capacity is zero then return zero
		if (length == 0 || capacity == 0) {
			return 0;
		}

		if (weight[length - 1] <= capacity) {
			return Math.max(
					value[length - 1] + findMaximumProfit(weight, value, capacity - weight[length - 1], length),
					findMaximumProfit(weight, value, capacity, length - 1));
		}

		// if weight[length - 1] > capacity
		return findMaximumProfit(weight, value, capacity, length - 1);
	}

}
