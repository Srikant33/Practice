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
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    public void helper (TreeNode root, int level){
        if (root == null){
            return;
        }
        hm.put(level, hm.getOrDefault(level, 0)+root.val);
        helper(root.left, level+1);
        helper(root.right, level+1);
    }

    public int maxLevelSum(TreeNode root) {
        helper(root, 1);
        int max = Integer.MIN_VALUE;
        int level = Integer.MAX_VALUE;
        System.out.println(hm);
        for (int i : hm.keySet()){
            if (hm.get(i)>= max){
                if (level > i && hm.get(i)== max){
                    level= i;
                }
                else if (hm.get(i)> max){
                    level = i;
                }
                max= hm.get(i);
            }
        }

        return level;
    }
}