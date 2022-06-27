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
    public boolean post(TreeNode root) {
        if (root==null){
            return false;
        }       
        if (post(root.right)== false){
            root.right = null;
        }
        if (post(root.left)== false){
            root.left = null;
        }
        if (post(root.right) == true || post(root.left) == true || root.val ==1){
            return true;
        }
        return false;
    }
    
    public TreeNode pruneTree(TreeNode root) {
        boolean x=post(root);
         if (x==false && root.val !=1){
             // System.out.println(root.val);
             return null;
         }
        return root;
    }
}