package str;

public class fourth {
    // LeetCode 283: Move Zeroes
    // Move all 0's to the end of the array while maintaining the relative order of the non-zero elements.
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
} 