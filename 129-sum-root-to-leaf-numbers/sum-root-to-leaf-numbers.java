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
    private int sum =0;
    public int sumNumbers(TreeNode root) {
        inorder(root, 0);
        return sum;
    }
    public void inorder(TreeNode root, int val){
        if (root == null){
            return;
        }
        val=val*10+root.val;
        if (root.left == null && root.right == null){
            sum+=val;
            return;
        }
        inorder(root.left, val);
        inorder(root.right, val);
        return;
    }
}