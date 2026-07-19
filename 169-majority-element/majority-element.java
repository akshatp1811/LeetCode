class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int ans = -1;
        for(int i = 0; i< n; i++){
            int key = nums[i];
            if(map.containsKey(nums[i])){
                map.put(key, map.get(key) + 1);
                if(map.get(key) > n/2){
                    ans = key;
                    return ans;
                }
            }
            else{
                map.put(key, 1);
                if(map.get(key) > n/2){
                    ans = key;
                    return ans;
                }
            }
            
        } 
        return ans;
    }
}