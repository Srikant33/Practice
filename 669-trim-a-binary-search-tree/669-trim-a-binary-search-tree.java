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
    TreeNode ret;
    
    public TreeNode BST(TreeNode root, int low, int high){
        
        if (root==null){
            return null;
        }
        
        else if (root.val<low){
            // System.out.println("nul");
            root=BST(root.right, low, high);
            if (root==null){
                return null;
            }
        }
        else if (root.val>high){
            root=BST(root.left, low, high);
            if (root==null){
                return null;
            }
            
        }
        // System.out.println(root.val);
        
        root.left=BST(root.left, low, high);
        
        root.right=BST(root.right, low, high);
        
        return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        root=BST(root, low, high);
        return root;
    }
}