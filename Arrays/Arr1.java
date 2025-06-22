class Arr1 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for the place to insert unique elements

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;            // move to next position
                nums[i] = nums[j]; // overwrite with next unique element
            }
        }
        return i + 1;
    }
}
