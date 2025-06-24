package str;

public class second {
    /**
     * LeetCode 136: Single Number
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     * Example: Input: [4,1,2,1,2] Output: 4
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
}
