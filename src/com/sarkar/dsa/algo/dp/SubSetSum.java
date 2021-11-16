package com.sarkar.dsa.algo.dp;

public class SubSetSum {

	public static void main(String[] args) {
		int[] arr = {2, 6, 14, 6};
		System.out.println(findSubSetSumRecursively(arr, 4, 12));
		System.out.println(findSubSetSumRecursively(arr, 4, 81));
	}

	// This solution is having a time complexity of O(2^n) and space complexity of O(1)
	private static boolean findSubSetSumRecursively(int[] arr, int size, int sum) {
		if (sum == 0)
			return true;
		if (size == 0)
			return false;
		if (arr[size - 1] > sum) {
			return findSubSetSumRecursively(arr, size - 1, sum);
		}
		return findSubSetSumRecursively(arr, size - 1, sum - arr[size - 1])
				|| findSubSetSumRecursively(arr, size - 1, sum);

	}
	
	// Dynamic Programming Approach
	private static boolean findSubSetSumMemorization(int[] arr, int size, int sum) {
		return false;
	}

}
