package com.sarkar.dsa.algo.dp;

public class LCS {

	static String X = "AGGTAB";
	static String Y = "GXTXAYB";
	static int[][] T = new int[X.length() + 1][Y.length() + 1];

	public static void main(String[] args) {

		// initializeMatrix(T, X.length() + 1, Y.length() + 1);
		//System.out.println(findLcsByMemorization(X, Y, X.length(), Y.length()));
		System.out.println(findLcsByBottomUp(X, Y));

	}

	private static void initializeMatrix(int[][] t, int m, int n) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				T[i][j] = -1;
			}
		}
	}

	/**
	 * 
	 * Brute Force Recursive Approach
	 * 
	 */
	private static int findLCS(String x, String y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (x.charAt(m - 1) == y.charAt(n - 1))
			return 1 + findLCS(x, y, m - 1, n - 1);
		else
			return Math.max(findLCS(x, y, m, n - 1), findLCS(x, y, m - 1, n));
	}

	/**
	 * 
	 * DP - Memorization or Top - Down
	 * 
	 */
	private static int findLcsByMemorization(String x, String y, int m, int n) {
		if (m == 0 || n == 0)
			return 0;

		if (T[m][n] != -1)
			return T[m][n];

		if (x.charAt(m - 1) == y.charAt(n - 1))
			return T[m][n] = 1 + findLcsByMemorization(x, y, m - 1, n - 1);
		else
			return T[m][n] = Math.max(findLcsByMemorization(x, y, m, n - 1), findLcsByMemorization(x, y, m - 1, n));
	}

	/**
	 * 
	 * DP - Bottom Up Approach Time Complexity - O(mn)
	 * 
	 */
	private static int findLcsByBottomUp(String x, String y) {

		int m = x.length();
		int n = y.length();
		int[][] L = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1))
					L[i][j] = 1 + L[i - 1][j - 1];
				else
					L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
			}
		}
		return L[m][n];
	}

}
