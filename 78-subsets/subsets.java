class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> lis = new ArrayList<>();

        findSubsets(0, lis, new ArrayList<>(), nums);

        return lis;
    }

    void findSubsets(int index,
                     List<List<Integer>> ans,
                     List<Integer> lis,
                     int[] num) {

        if (index == num.length) {
            ans.add(new ArrayList<>(lis));
            return;
        }

        // Pick
        lis.add(num[index]);
        findSubsets(index + 1, ans, lis, num);

        // Backtrack
        lis.remove(lis.size() - 1);

        // Not Pick
        findSubsets(index + 1, ans, lis, num);
    }
}