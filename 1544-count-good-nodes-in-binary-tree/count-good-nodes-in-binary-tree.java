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
    public int good(TreeNode root, int highest, int count){
        if (root == null){
            return count;
        }
        //if higher 
        else if (root.val >= highest){
            count++;
        }
        count = good(root.left, Math.max(highest, root.val), count);
        count = good(root.right, Math.max(highest, root.val), count);

        return count;
    }
    public int goodNodes(TreeNode root) {
        return good(root, root.val, 0);       
    }
}