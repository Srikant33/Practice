/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node start = new Node();
        start = head; 
        
        while (head!=null){
            if (head.child!=null){
                Node next = head.next;
                head.next = head.child;
                head.child = null; 
                head.next.prev = head;
                Node n = flatten(head.next);
                while (n.next!=null){
                    n=n.next;
                }
                n.next = next;
                if (next!=null){
                    next.prev = n;
                }
            }
            head = head.next;
        }
        
        return start;
    }
}