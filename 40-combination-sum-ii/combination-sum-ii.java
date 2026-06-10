class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        findCombination(0,candidates,target,ans,new ArrayList<>());
        return ans; 
    }
    void findCombination(int ind,int[] arr,int target,List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;//Not Pick
            if(arr[i] > target) break;//Stop iteration
            //pick
            ds.add(arr[i]);
            findCombination(i+1,arr,target - arr[i],ans,ds);
            //Not Pick
            ds.remove(ds.size()-1);
        }
    }
}