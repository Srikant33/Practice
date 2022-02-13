/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node next(Node root) {
        if (root==null || root.left == null || root.right==null)
            return root;
        System.out.println(root.val);
        root.left.next=root.right;
        root.left=next(root.left);
        if (root.next!=null)
            root.right.next=root.next.left;
        root.right=next(root.right);
        return root;
    }
    public Node connect(Node root) {
        
        return next(root);
    }
}