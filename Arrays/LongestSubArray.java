public class LongestSubArray {
    public static int longestSubArrayWithSumK(int[] nums, int k) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 1, 1, 2};
        int k = 3;
        int result = longestSubArrayWithSumK(nums, k);
        System.out.println("Length of longest subarray with sum " + k + " is: " + result);
    }
}