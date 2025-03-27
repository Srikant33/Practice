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
    //helper 
    public String roots(TreeNode root, String s){
        //if root
        if (root.left==null && root.right == null){
            return s+" "+String.valueOf(root.val);
        }
        //pre orfer 
        if (root.left!=null){
            s=roots(root.left, s);
        }
        if (root.right!=null){
            s=roots(root.right, s);
        }

        return s;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        // trtaverse and find the roots- save in string.. if same they are true
        //compair
        return roots(root1, "").equals(roots(root2, ""));
    }
}