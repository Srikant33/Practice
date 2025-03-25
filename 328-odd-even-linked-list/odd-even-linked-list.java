/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        // if only 1 element 
        if (head == null || head.next==null || head.next.next==null){
            return head;
        }
        ListNode lo = new ListNode();
        ListNode even = new ListNode();
        ListNode le = new ListNode();
        ListNode node = new ListNode();
        ListNode temp = new ListNode();
        
        boolean odd = true;
        //initialize
        lo = head;
        le = head.next;
        even = le;
        node = head.next.next;


        while (node!=null){
            /// add odd before all even elements 
            if (odd){
                // temp = lo.next;
                lo.next = node;
                lo = lo.next;
                // lo.next = temp;
            }
            // add a even element to the end 
            else {
                le.next = node;
                le = le.next;
            }
            //next element 
            odd = !odd;
            node = node.next;
            // System.out.println(node.val);
        }

        //attacking odds and evens
        le.next= null;
        lo.next = even;

        //return
        return head;

    }
}