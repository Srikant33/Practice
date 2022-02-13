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
    public boolean isSymmetric(TreeNode root1, TreeNode root2){
        if(root1==null || root2==null){
            return root1==root2;
        }
        boolean a=isSymmetric(root1.left, root2.right);
        boolean b=isSymmetric(root2.left, root1.right);
        if (root1!=null && root2!=null && a && b && root1.val==root2.val){
            return true;
        }
        return false;
    }  
    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return true;
        return isSymmetric(root.left,root.right);
        // System.out.println(l);
        // for (int i=0;i<l.size()/2;i++){
        //     if (l.get(i)!=l.get(l.size()-i-1)){
        //         System.out.println(l.get(i)+""+l.get(l.size()-i-1));
        //         return false;
        //     }
        // }
        // return true;
    }
    
    
//      List<Integer> l= new ArrayList<Integer>();
//     public void in(TreeNode root){
//         if (root==null){
//             l.add(-1);
//             return;
//         }
//         else{
//             in(root.left);
//             l.add(root.val);
//             in(root.right);
//         }
        
//     } 
}