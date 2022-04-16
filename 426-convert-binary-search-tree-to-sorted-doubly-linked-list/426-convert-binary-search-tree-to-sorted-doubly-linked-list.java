/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/
// class DL 
    // public Node
// }
class Solution {
    Node head= new Node(0);
    Node prev;
    Node cur= head;
    Node next;
    
    // cur=head;
    
    public void DL (Node root){
        if (root== null){
            return;
        }
        DL(root.left);
        cur.right=root;
        prev=cur;
        cur=cur.right;
        cur.left=prev;
        DL(root.right);
        
        cur.right=head.right;
        head.right.left=cur;
        
        return;
    }
    public Node treeToDoublyList(Node root) {
        
        DL(root);
        return head.right;

        
    }
}