package sarkar.dsa.algo.dp.lcs;

public class MinNumOfDeletionToMakePalindrome {

    public static void main(String[] args) {
        String str = "axbcpban";
        int pLength = findLongestPalindromicSubSeqLength(str);
        int numberOfDeletion = str.length() - pLength;
        System.out.println("Number of Deletion required - " + numberOfDeletion);
    }

    private static int findLongestPalindromicSubSeqLength(String x) {
        return findLcsCount(x, new StringBuilder(x).reverse().toString());
    }

    private static int findLcsCount(String x, String y) {
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

}
