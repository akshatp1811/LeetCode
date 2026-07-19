class Solution {
    public void moveZeroes(int[] nums) {
        //Move all the non zero elements in the front and then add 0s to the ramaining places
        int start = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                nums[start] = nums[i];
                start++;
            }
        }
        for(int i = start; i < n; i++){
            nums[i] = 0;
        }

    }
}