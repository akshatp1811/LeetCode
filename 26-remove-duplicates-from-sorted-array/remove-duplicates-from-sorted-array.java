class Solution {
    public int removeDuplicates(int[] nums) {
        int LastUniquePos = 0;
        int n = nums.length;
        for(int i = 0; i< n-1; i++){
            int next = i+1;
            if(nums[i] == nums[next]){
                continue;
            }
            if(nums[i] != nums[next]){
                LastUniquePos++;
                nums[LastUniquePos] = nums[next];
            }

        }
        return LastUniquePos + 1;
    }
}