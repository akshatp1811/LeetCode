/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    // Finds the path from root to target node
    private boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path) {

        if (root == null)
            return false;

        // Add current node to the path
        path.add(root);

        // Target found
        if (root == target)
            return true;

        // Search in left or right subtree
        if (findPath(root.left, target, path) ||
            findPath(root.right, target, path)) {
            return true;
        }

        // Target not found in this subtree, backtrack
        path.remove(path.size() - 1);
        return false;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();

        // Find paths to both nodes
        findPath(root, p, pathP);
        findPath(root, q, pathQ);

        int i = 0;

        // Compare the paths
        while (i < pathP.size() &&
               i < pathQ.size() &&
               pathP.get(i) == pathQ.get(i)) {
            i++;
        }

        // Last common node
        return pathP.get(i - 1);
    }
}