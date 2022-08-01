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
    
    public List<Integer> helper (TreeNode root, List<Integer> l){
        if (root == null){
            return l;
        }
        
        if (root.left == null && root.right == null){
            l.add(root.val);
            root = null;
            return l;
        }
        
        l= helper(root.left, l);
        l= helper(root.right, l);
        
        return l;
    }
    
    public void helper1 (TreeNode root){
        if (root == null ){
            return;
        }
        if (root.left!=null && root.left.left ==null && root.left.right ==null){
            root.left = null;
        }
        if (root.right!=null && root.right.left ==null && root.right.right ==null){
            root.right = null;
        }
        
        helper1(root.left);
        helper1(root.right);
    }
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        if (root == null){
            return ll;
        }
        
        while (root.left != null || root.right!=null){
            List<Integer> l = new ArrayList<>();
            l = helper(root, l);
            helper1(root);
            ll.add(l);
        }
        List<Integer> l = new ArrayList<Integer>();
        l.add(root.val);
        ll.add(l); 
        
        return ll;
    }
}