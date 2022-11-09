package sarkar.dsa.algo.dp.lcs;

public class ShortestCommonSuperSeq {

    public static void main(String[] args) {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        System.out.println(findShortestCommonSuperSequence(a, b));
        printShortestCommonSuperSequence(a, b);
    }

    private static void printShortestCommonSuperSequence(String x, String y) {
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
                if (DP[k - 1][l] > DP[k][l - 1]) {
                    builder.append(x.charAt(k - 1));
                    k--;
                } else {
                    builder.append(y.charAt(l - 1));
                    l--;
                }
            }
        }

        while (k > 0) {
            builder.append(x.charAt(k - 1));
            k--;
        }

        while (l > 0) {
            builder.append(y.charAt(l - 1));
            l--;
        }

        System.out.println(builder.reverse());
    }

    private static int findShortestCommonSuperSequence(String x, String y) {
        return x.length() + y.length() - findLcsByBottomUp(x, y);
    }

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

}
