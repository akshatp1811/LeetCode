class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        Set<Integer> ans = new HashSet<>();
        int minMaj = (int)Math.floor(n/3);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            int key = nums[i];
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
                if(map.get(key) > minMaj){
                    ans.add(key);
                }
            }
            else{
                map.put(key,1);
                if(map.get(key) > minMaj){
                    ans.add(key);
                }
            }
        }
        return new ArrayList<>(ans);
    }
}