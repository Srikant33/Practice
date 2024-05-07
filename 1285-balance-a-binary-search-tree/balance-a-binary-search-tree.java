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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> l = new LinkedList<Integer>();

        l= inorder(root, new LinkedList<Integer>());
        // System.out.println(l);


        return maker(l);
    }

    public TreeNode maker(List<Integer> l){
        if (l.size()==0){
            return null;
        }
        int center =l.size()/2;
        return new TreeNode(l.get(center), maker(l.subList(0,center)), maker(l.subList(center+1,l.size())));
    }

    public List<Integer> inorder(TreeNode root, List<Integer> l){
        if (root==null){
            return l;
        }
        l=inorder(root.left, l);
        l.add(root.val);
        l=inorder(root.right,l );
        return l;
    }
}