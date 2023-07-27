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
    public ListNode partition(ListNode head, int x) {
        ListNode curr = new ListNode();
        curr = head;
        ListNode smaller = new ListNode();
        ListNode greater = new ListNode();

        ListNode s = new ListNode();
        ListNode g = new ListNode();
        
        s=smaller;
        g=greater; 

        //traversing
        while (curr != null){

            if (curr.val < x){
                s.next = curr;
                s =s.next;
            }
            else {
                g.next = curr;
                g = g.next;
            }
            curr= curr.next;
        }

        g.next = null;
        s.next = greater.next;

        return smaller.next;  

    }
}