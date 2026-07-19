class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        return solve(n,dp);
    }
    public int solve(int n,int[] dp){
        if(n<=1) return 1;
        if(dp[n] != 0) return dp[n];
        int left = solve(n-1,dp);
        int right = solve(n-2,dp);
        dp[n] = left + right;
        return dp[n];
    }
}