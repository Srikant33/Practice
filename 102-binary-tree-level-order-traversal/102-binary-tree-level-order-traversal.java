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
    
    public List<List<Integer>> order(TreeNode root, List<List<Integer>> ll, int level) {
        if (root == null){
            return ll; 
        }
        List<Integer> l = new ArrayList<>();
        if (ll.size() > level) l= ll.get(level);
        l.add(root.val);
        if (ll.size() > level) ll.set(level, l);
        else ll.add(level, l);
        ll = order(root.left, ll, level+1);
        ll = order(root.right , ll , level+1);
        return ll;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ll = new ArrayList<>();
        return order(root, ll , 0);
    }
}