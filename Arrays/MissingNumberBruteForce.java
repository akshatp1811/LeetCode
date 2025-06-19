package Arrays;
class missingNumberBruteForce {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        missingNumberBruteForce sol = new missingNumberBruteForce();
        int[] nums = {3, 0, 1};
        int result = sol.missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
}
