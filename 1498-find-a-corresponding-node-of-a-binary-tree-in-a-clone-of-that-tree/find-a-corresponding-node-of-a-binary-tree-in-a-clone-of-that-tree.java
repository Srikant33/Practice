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
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Stack <TreeNode> or = new Stack<>();
        Stack <TreeNode> cl = new Stack<>();
        
        or.push(original);
        cl.push(cloned);

        while (!or.isEmpty()){
            TreeNode co = or.pop();
            TreeNode cc = cl.pop();

            if (co == target){
                return cc;
            }
            
            if (co.left != null){
                or.push(co.left);
                cl.push(cc.left);
            }
            if (co.right != null){
                or.push(co.right);
                cl.push(cc.right);
            }

            // System.out.println(or);
        }

        return new TreeNode(-1);
    }
}