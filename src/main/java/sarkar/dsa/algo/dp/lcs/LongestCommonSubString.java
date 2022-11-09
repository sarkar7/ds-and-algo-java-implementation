package sarkar.dsa.algo.dp.lcs;

public class LongestCommonSubString {

	public static void main(String[] args) {
		String X = "AGGTXAB";
		String Y = "GXTXAYB";
		System.out.println(findLcString(X, Y, X.length(), Y.length(), 0));
		System.out.println(findLcStringByBottomUp(X, Y));
	}

	/**
	 * 
	 * Brute Force - Recursive Solution
	 * Time Complexity - O(3 ^(n*m))
	 * Space Complexity - O(max(n, m))
	 * 
	 */
	private static int findLcString(String x, String y, int m, int n, int count) {
		if (m == 0 || n == 0)
			return count;
		if (x.charAt(m - 1) == y.charAt(n - 1)) {
			count = findLcString(x, y, m - 1, n - 1, count + 1);
		}
		int count1 = findLcString(x, y, m - 1, n, 0);
		int count2 = findLcString(x, y, m, n - 1, 0);
		count = Math.max(count, Math.max(count1, count2));
		return count;
	}

	/**
	 * 
	 * Optimized - Bottom-Up Solution
	 * Time Complexity - O(3 ^(n*m))
	 * Space Complexity - O(max(n, m))
	 * 
	 */
	private static int findLcStringByBottomUp(String x, String y) {
		int m = x.length();
		int n = y.length();
		int max = 0;
		int[][] DP = new int[m + 1][n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (x.charAt(i - 1) == y.charAt(j - 1))
					DP[i][j] = 1 + DP[i - 1][j - 1];
				else
					DP[i][j] = 0;

				if (DP[i][j] > max) {
					max = DP[i][j];
				}
			}
		}
		return max;
	}

}
