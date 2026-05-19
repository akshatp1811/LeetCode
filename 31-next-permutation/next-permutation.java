class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int ind = -1;

        // Find breakpoint
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                ind = i;
                break;
            }
        }

        // If no breakpoint exists
        if(ind == -1){
            reverse(nums, 0, n - 1);
            return;
        }

        // Find just greater element
        for(int i = n - 1; i > ind; i--){
            if(nums[i] > nums[ind]){
                swap(nums, i, ind);
                break;
            }
        }

        // Reverse suffix
        reverse(nums, ind + 1, n - 1);
    }

    public void reverse(int[] nums, int left, int right){
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}