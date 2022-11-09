package sarkar.dsa.algo.dp.lcs;

public class LongestCommonSubSequence {

    static String X = "AGGTXAB";
    static String Y = "GXTXAYB";
    static int[][] T;

    public static void main(String[] args) {
        System.out.println(findLcsByMemorization(X, Y, X.length(), Y.length()));
        System.out.println(findLcsByBottomUp(X, Y));
        System.out.println(findLCS(X, Y, X.length(), Y.length()));
        printLcs(X, Y);
    }

    private static void initializeMatrix(int[][] t, int m, int n) {
        T = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                T[i][j] = -1;
            }
        }
    }

    /**
     * Brute Force Recursive Approach
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
     * DP - Memorization or Top - Down
     */
    private static int findLcsByMemorization(String x, String y, int m, int n) {
        if (m == 0 || n == 0)
            return 0;
        initializeMatrix(T, m, n);

        if (T[m][n] != -1)
            return T[m][n];

        if (x.charAt(m - 1) == y.charAt(n - 1))
            return T[m][n] = 1 + findLcsByMemorization(x, y, m - 1, n - 1);
        else
            return T[m][n] = Math.max(findLcsByMemorization(x, y, m, n - 1), findLcsByMemorization(x, y, m - 1, n));
    }

    /**
     * DP - Bottom Up Approach Time Complexity - O(mn)
     */
    private static int findLcsByBottomUp(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] DP = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1))
                    DP[i][j] = 1 + DP[i - 1][j - 1];
                else
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
            }
        }
        return DP[m][n];
    }

    private static void printLcs(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] DP = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1))
                    DP[i][j] = 1 + DP[i - 1][j - 1];
                else
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
            }
        }

        int k = m;
        int l = n;
        StringBuilder builder = new StringBuilder();
        while (k > 0 && l > 0) {
            if (x.charAt(k - 1) == y.charAt(l - 1)) {
                builder.append(x.charAt(k - 1));
                k--;
                l--;
            } else {
                if (DP[k - 1][l] > DP[k][l - 1])
                    k--;
                else
                    l--;
            }
        }
        System.out.println(builder.reverse());
    }

}
