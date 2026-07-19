class Solution {
    public boolean canJump(int[] nums) {
        /*At each index we update the farthest by Math.max(farthest, i + nums[i])
        i should not go beyond farthest if it goes we immedeatly return false.
        at the end if Farthest >= n and i has reached the end then we can say that we have done it*/        
        int farthest = 0;
        int n = nums.length;
        for(int i = 0; i< n; i++){
            if(i > farthest) return false;
            farthest = Math.max(farthest,i+ nums[i]);
            if(farthest >= n - 1) return true;
        }
    return false;
    }
}