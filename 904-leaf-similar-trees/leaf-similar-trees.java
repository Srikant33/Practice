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
    public void roots(TreeNode root, List<Integer> list){
        //if root
        if (root.left==null && root.right == null){
            list.add(root.val);
        }
        //pre orfer 
        if (root.left!=null){
            roots(root.left, list);
        }
        if (root.right!=null){
            roots(root.right, list);
        }
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        // trtaverse and find the roots- save in string.. if same they are true
        //compair
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        
        //calling functiuon 
        roots(root1, l1);
        roots(root2, l2);

        return l1.equals(l2);
    }
}