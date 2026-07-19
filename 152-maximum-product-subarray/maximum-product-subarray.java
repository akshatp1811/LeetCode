class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int MaxProd = Integer.MIN_VALUE;
        for(int i = 0; i< n; i++){
            int prod = 1;
            for(int j = i; j< n; j ++){
                prod = prod*nums[j];
                MaxProd = Integer.max(MaxProd, prod);
            }
        }
        return MaxProd;
    }
}