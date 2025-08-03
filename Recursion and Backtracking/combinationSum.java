import java.util.*;

public class combinationSum {

    public void findCombination(int[] arr, int target, int ind, List<List<Integer>> ans, List<Integer> ds) {
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombination(arr, target - arr[ind], ind, ans, ds);
            ds.remove(ds.size() - 1);
        }

        findCombination(arr, target, ind + 1, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        combinationSum solution = new combinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations for target " + target + ": " + result);
    }
}