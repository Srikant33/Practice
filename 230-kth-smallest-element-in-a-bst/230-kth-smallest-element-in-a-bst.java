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
    int count=0;
    int res=-1;
    public int kthSmallest(TreeNode root, int k) {
        
        if (root==null){
            return 0;
        }
                
        int temp=0;
        
        temp=kthSmallest(root.left, k);
        // System.out.println(root.val);

        count++;
        if (count == k)
            res= root.val;
        
        temp=kthSmallest(root.right, k);
        return res;
    }
}