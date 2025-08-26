class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);  // sort to handle duplicates easily
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }
    public void findCombination(int ind,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        //Base case
        if(target == 0){
            ans.add(new ArrayList<> (ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i>ind && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            findCombinations(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size() - 1);
        }
    }
}