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
class BSTIterator {
    TreeNode pointer= new TreeNode(0);
    TreeNode pointer1= pointer;
    TreeNode prev;
    public void inorder(TreeNode root){
        if (root==null){
            return;
        }
        inorder(root.left);
        pointer1.right=root;
        pointer1= pointer1.right;
        inorder(root.right);
        return;
    }
    
    public BSTIterator(TreeNode root) {
         inorder(root);
    }
    
    public int next() {
        // System.out.println(pointer.val);

        pointer=pointer.right;
        return pointer.val;
    }
    
    public boolean hasNext() {
        if (pointer.right!=null){
            return true;
        }
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */