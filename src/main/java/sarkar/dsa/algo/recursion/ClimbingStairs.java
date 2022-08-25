package sarkar.dsa.algo.recursion;

public class ClimbingStairs {

	public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return helperclimbStairs(n, dp);
    }
    
    public int helperclimbStairs(int n, int[] dp) {
        if (n <= 1) return 1;
        if (dp[n] > 0) return dp[n];
        return dp[n] = helperclimbStairs(n - 1, dp) + helperclimbStairs(n - 2, dp);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
