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
    //helper function to find depth 
    public int depth (TreeNode root, int depth){
        //if there are no more roots 
        if (root == null){
            return depth;
        }
        // right and left
        return Math.max(depth(root.left, depth +1) , depth(root.right, depth +1));
    }

    public int maxDepth(TreeNode root) {
        //calling function 
        return depth(root, 0);    
    }
}