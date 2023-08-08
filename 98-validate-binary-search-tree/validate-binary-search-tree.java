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
    public boolean helper(TreeNode root, Long min, Long max){
        if (root == null){
            return true;
        }
        else if (root.val <= min || root.val >= max ){
            return false;
        }
        return helper(root.left, min, Long.valueOf(root.val)) && helper(root.right, Long.valueOf(root.val), max);
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)){
            return true;
        }
        return helper (root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}