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
    public boolean findPath(TreeNode root, TreeNode target, List<TreeNode> path)
    {
        if(root == null)
            return false;
        path.add(root);
        if(root == target)
            return true;
        //if we get the target in either of the left or right subtree we return true
        if(findPath(root.left,target,path) || findPath(root.right,target,path))
            return true;
        
        //if target is not found in anu subtree then return back
        path.remove(path.size() - 1);
        return false;
        //since the same path array is going across the functions so if we dont find the value we delete from the path--this is an important point which i did not understood.
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> pathP = new ArrayList<>();
        List<TreeNode> pathQ = new ArrayList<>();
        findPath(root,p,pathP);
        findPath(root,q,pathQ);
        int i = 0;
        while (i < pathP.size() &&
               i < pathQ.size() &&
               pathP.get(i) == pathQ.get(i)) {
            i++;
        }
        return pathP.get(i-1);
    }
}