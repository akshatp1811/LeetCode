class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int prev = i-1;
            if(nums[prev] > nums[i]){
                count++;
            }
            //circular checke that is last > first
        }
        if(nums[0] < nums[n-1]){
                count++;
            }
        if(count > 1)
        return false;
        else return true;
        }
}