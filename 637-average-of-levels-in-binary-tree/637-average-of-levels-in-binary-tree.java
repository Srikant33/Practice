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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q =new LinkedList<>();
        List<Double> l= new ArrayList<>();
        q.add(root);
        while (!q.isEmpty()){
            double sum=0;
            int count = 0;
            int size = q.size();    
            for (int i=0; i<size; i++){
                count++;    
                TreeNode t= q.poll();
                sum+=t.val;
                if(t.left!=null){
                    q.add(t.left);
                }
                if (t.right!=null){
                    q.add(t.right);
                }
            }
            System.out.println(sum+" "+count);
            l.add(sum/count);
        }
        
        return l;
    }
}