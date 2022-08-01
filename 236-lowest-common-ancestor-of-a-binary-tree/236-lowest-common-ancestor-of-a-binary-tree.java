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
    public boolean contains(TreeNode root, TreeNode x){
        if(root == null){
            return false;
        }
        if (root == x){
            return true;
        }
        return contains(root.left, x)|| contains(root.right, x) || root == x; 
    } 
    
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode x= new TreeNode();
        while (x!=root){
            x=root;
            if (contains(root.left, p) && contains(root.left, q)){
                root= root.left;
            }
            else if (contains(root.right, p) && contains(root.right, q)){
                root= root.right;
            }
            
        }
        
        return root;
    }
}