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
    int val;
    public TreeNode BST(TreeNode root){
        if (root== null){
            return root; 
        }
        else if (root.val == val  ){
            return root;
        }
        else if (root.val <val){
            root= BST(root.right);
        }
        else if (root.val > val){
            root= BST(root.left);
        }
        return root;
    }
       
    public TreeNode searchBST(TreeNode root, int val) {
        this.val=val;
        return BST(root);
    }
}