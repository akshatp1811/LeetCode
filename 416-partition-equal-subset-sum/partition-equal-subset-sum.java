class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i< nums.length;i++){
            sum += nums[i];
        }
        if(sum % 2 != 0) return false;
        else return subset(nums,sum/2);
    }
    public boolean subset(int[] nums, int sum){
        boolean[][] dp = new boolean[nums.length + 1][sum+1];
        //initialization
        for(int i = 0; i <= nums.length; i++)
            dp[i][0] = true;

        for(int j = 1; j <= sum; j++)
            dp[0][j] = false;


        for(int i = 1; i< nums.length + 1; i++){
            for(int j = 1; j<= sum; j++){
                if(nums[i-1]<= j){
                    dp[i][j] = dp[i-1][j - nums[i-1]] || //pick
                        dp[i-1][j];//notPick
                }
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[nums.length][sum];
    }
}