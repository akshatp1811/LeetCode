package str;

public class eighth {
    // LeetCode 560: Subarray Sum Equals K
    // Given an array of integers and an integer k, return the total number of continuous subarrays whose sum equals to k.
    public int subarraySum(int[] nums, int k) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            count += map.getOrDefault(sum - k, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
} 