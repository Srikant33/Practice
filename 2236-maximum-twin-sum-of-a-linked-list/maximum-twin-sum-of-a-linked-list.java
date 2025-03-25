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
    public int pairSum(ListNode head) {
        // find the middle of the linked list 
            // fast and slow linked list 
            ListNode fast = new ListNode();
            ListNode slow = new ListNode();

        // reverse the linked list from there
            ListNode prev = new ListNode();
            ListNode next = new ListNode();
 
        // find sums and find max of the sums
            int max = Integer.MIN_VALUE;

        
        //initializing 
        slow = head;
        fast = head;
        prev= null;

        //TRAVERSING
            while (fast != null){
                fast = fast.next.next;
                next = slow.next;
                slow.next= prev;
                prev= slow;
                slow = next;
            } 

        // adding twins
        while (slow!=null){
            max = Math.max(max, slow.val + prev.val);
            slow = slow.next;
            prev= prev.next;
        }

        //returning 
        return max;
    }
}