package sarkar.dsa.algo.dp.lcs;

public class SequencePatternMatching {

    public static void main(String[] args) {
        String X = "ABCF";
        String Y = "AXEBEC";
        System.out.println(isMatching(X, Y));
    }

    private static boolean isMatching(String x, String y) {
        return x.length() == findLcsCountByBottomUp(x, y);
    }

    private static int findLcsCountByBottomUp(String x, String y) {
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
