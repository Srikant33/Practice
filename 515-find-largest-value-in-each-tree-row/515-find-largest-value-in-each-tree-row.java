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
    Stack<TreeNode> l1= new Stack<>();
    Stack<TreeNode> l2= new Stack<>();
    List<Integer> ret= new ArrayList<Integer>();
    
    
    public List<Integer> largestValues(TreeNode root) {
    
        if(root==null){
            return ret;
        }
        l2.push(root);
        while (!l2.isEmpty()){
            while (!l2.isEmpty()){
                l1.push(l2.pop());
            }
            // l2.clear();
            int max=Integer.MIN_VALUE;
            while (!l1.isEmpty()){
                
                if (l1.peek().left != null){
                    l2.push(l1.peek().left);
                }
                if (l1.peek().right != null){
                    l2.push(l1.peek().right);
                }
                max= Math.max(max, l1.pop().val);
            }
            ret.add(max);
        }
        return ret;
    }
}