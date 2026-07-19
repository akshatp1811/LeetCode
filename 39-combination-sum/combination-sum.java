class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> lis = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        recursion(ans,candidates,target,lis,0);
        return ans;
    }
    void recursion(List<List<Integer>> ans,int[] candidates, int target,List<Integer> lis,int index){
        if (target == 0) {
            ans.add(new ArrayList<>(lis));
            return;
        }

        if (index == candidates.length || target < 0) {
            return;
        }
        lis.add(candidates[index]);
        recursion(ans,
                  candidates,
                  target - candidates[index],
                  lis,
                  index); 
        lis.remove(lis.size() - 1);
        recursion(ans,
                  candidates,
                  target,
                  lis,
                  index + 1);
        
    }
}