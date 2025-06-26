package str;

public class fifth {
    // LeetCode 287: Find the Duplicate Number
    // Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), find the duplicate number.
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
} 