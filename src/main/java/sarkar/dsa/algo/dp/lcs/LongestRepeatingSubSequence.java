package sarkar.dsa.algo.dp.lcs;

public class LongestRepeatingSubSequence {

    public static void main(String[] args) {
        String X = "AAHBYBUICRC";
        printLongestRepeatingSubSequence(X,X);

    }

    private static void printLongestRepeatingSubSequence(String x, String y) {
        int m = x.length();
        int n = y.length();
        int[][] DP = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (x.charAt(i - 1) == y.charAt(j - 1) && i != j)
                    DP[i][j] = 1 + DP[i - 1][j - 1];
                else
                    DP[i][j] = Math.max(DP[i - 1][j], DP[i][j - 1]);
            }
        }

        int k = m;
        int l = n;
        StringBuilder builder = new StringBuilder();
        while (k > 0 && l > 0) {
            if (x.charAt(k - 1) == y.charAt(l - 1) && k != l) {
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
