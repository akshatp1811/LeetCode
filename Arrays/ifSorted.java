class Solution {
    public boolean check(int[] nums) {
        boolean isSorted = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] <=  nums[i]){
                isSorted = true;
            }
            else
            isSorted = false;
        }
        return isSorted;

        }
    }
