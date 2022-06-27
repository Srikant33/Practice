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
    
    public int height(TreeNode root) {
        
        if (root.right == null && root.left == null ){
            return 1;
        }
        if (root.right == null ){
            return height(root.left)+1;
        }
        if (root.left == null ){
            return height(root.right)+1;
        }
        return Math.min(height(root.right), height(root.left))+1;
    }
    
    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return height(root);
    }
}