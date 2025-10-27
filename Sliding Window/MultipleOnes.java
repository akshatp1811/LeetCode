class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int count = 0;
        int maxlen = 0;
        
        while(l <= r && r < nums.length){
            if(nums[r] == 0){
                count++;
            }
            while(count <= k && r < nums.length){
                r++;
            }
            while(count > k && r < nums.length && l <= r)
            {
                if(nums[l] == 0){
                    count--;
                }
                l++;
            }
        maxlen = Math.max(maxlen, r-l-1);
        }
        return maxlen;
}
}

