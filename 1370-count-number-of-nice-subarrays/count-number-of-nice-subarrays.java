class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return LessThanEqK(nums, k) - LessThanEqK(nums, k - 1);
    }
    public int LessThanEqK(int[] nums, int goal) {
    if(goal < 0) return 0;

    int l = 0;
    int sum = 0;
    int count = 0;
    int numSub = 0;

    for(int r = 0; r < nums.length; r++) {
        if(nums[r]%2 != 0){
            numSub++;
        }

        while(numSub > goal) {
            if(nums[l]%2 != 0){
                numSub--;
            }
            l++;
        }

        count += (r - l + 1);
    }

    return count;
    }
}