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
    int max;
    
    public int helper (TreeNode root){
        if (root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        
        max= Math.max(root.val+left+right, max);
        
        return root.val+Math.max(left, right)>0 ?root.val+Math.max(left, right) :0 ;
    }
    
    public int maxPathSum(TreeNode root) {
        max=Integer.MIN_VALUE;
        helper(root);
        return max;
    }
}