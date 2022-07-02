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
    TreeMap<Integer, Integer> hm =new TreeMap<>();
    int max=0;
    public int hm (TreeNode root) {
       if (root == null ){
           return 0;
       }
       int sum =0; 
        sum +=hm(root.left);
        sum +=hm(root.right);
        sum +=root.val;
        hm.put(sum , hm.getOrDefault(sum, 0)+1);
        max=Math.max(max, hm.get(sum));
        return sum;
    }
    
    public int[] findFrequentTreeSum(TreeNode root) {
        hm(root);
        // System.out.println(hm + " "+ max);
        int count = 0; 
        for (Map.Entry entry: hm.entrySet()){
            if (Integer.parseInt(entry.getValue().toString())==max){
                count++;
            }
            
        }
        int[] ret = new int[count];
        int i=0;
        for (Map.Entry entry: hm.entrySet()){
            if (Integer.parseInt(entry.getValue().toString())==max){
                ret[i]=Integer.parseInt(entry.getKey().toString());
                i++;
            }
        }
        
        return ret;
    }
}