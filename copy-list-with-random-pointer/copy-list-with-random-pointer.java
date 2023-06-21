/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null ){
            return head; 
        }
        HashMap<Node, Node> hm = new HashMap<>();
        hm.put(null, null);
        Node curr = new Node(0);
        curr= head;

        while (curr != null){
            Node copy_o = new Node(0);
            copy_o= curr;
            Node copy_c = new Node(curr.val);
            
            hm.put(copy_o, copy_c);
            curr= curr.next;
        }

        curr= head;

        while (curr!=null){
            hm.get(curr).next= hm.get(curr.next);
            hm.get(curr).random= hm.get(curr.random);
            curr= curr.next;
        }

        return hm.get(head);
    }
}