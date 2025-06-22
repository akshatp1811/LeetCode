public class ProductNotSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        // Step 1: Compute prefix products
        output[0] = 1;
        for (int i = 1; i < n; i++) {
            output[i] = output[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] = output[i] * suffixProduct;
            suffixProduct *= nums[i];
        }

        return output;
    }
}

