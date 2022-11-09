package sarkar.dsa.algo.dp.lcs;

public class MinNumOfInsertionAndDeletion {

    public static void main(String[] args) {
        String a = "ABCDF";
        String b = "ZBCI";
        int lcsCount = findLcsCount(a, b);
        int numberOfInsertion = (lcsCount == b.length()) ? 0 : b.length() - lcsCount;
        int numberOfDeletion = a.length() - lcsCount;
        System.out.println("Number of Insertion required - " + numberOfInsertion);
        System.out.println("Number of Deletion required - " + numberOfDeletion);
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
