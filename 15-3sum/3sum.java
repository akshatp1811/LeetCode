import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) { 
        Set<List<Integer>> set = new HashSet<>();   
        // List<List<Integer>> ans = new ArrayList<>();  
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = i+1;
        int k = n-1;
        while(i < n - 2){
            while(j < k){
                if(nums[i]+nums[j] + nums[k] == 0){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    set.add(temp);
                    j++;
                    k--;
                }
                if(nums[i]+nums[j] + nums[k] < 0){
                    j++;
                }
                if(nums[i]+nums[j] + nums[k] > 0){
                    k--;
                }
            }
            i++;
            j = i+1;
            k = n-1;
        }
        return new ArrayList<>(set);
    }
}