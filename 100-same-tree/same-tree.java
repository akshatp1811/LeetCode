/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p == null) && (q == null)) return true;
        if((p == null) && (q != null) || (p != null) && (q == null)) return false;
        if(p.val != q.val) return false;//THis is the main base case that is if vlaue of p and q are same when we traverse through recuresion at every point it will check this condition
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}