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
    public Node connect(Node root) {
        Queue<Node> q1= new LinkedList<>();
        
        if (root == null)
            return root;
        
        
       q1.add(root);
        
        while (!q1.isEmpty()){
            int size= q1.size();
            
            for (int i=0;i<size; i++){
                Node node = q1.poll();
                if (i<size-1)
                    node.next= q1.peek();
                
                if (node.left!=null)
                    q1.add(node.left);
                    
                
                if (node.right!=null)
                    q1.add(node.right);
                
            }
        }
        
        return root;
    }
}