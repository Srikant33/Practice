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
    public ListNode deleteMiddle(ListNode head) {
        //2 linked lists ....one slow one fast 
        // when fast reaches end - then slow is the answer 
        ListNode phead = new ListNode();
        ListNode slow = new ListNode();
        ListNode pslow = new ListNode();
        ListNode fast = new ListNode();

        // starting from head 
        
        pslow.next=head;
        phead = pslow;
        slow = head;
        fast = head; 

        // traversing linked list 

        while (fast!= null && fast.next !=null){
            fast = fast.next.next;
            pslow = slow;
            slow = slow.next;
        }

        // slow will be middle ...so delete it 
        pslow.next = slow.next;


        return phead.next;
    }
}