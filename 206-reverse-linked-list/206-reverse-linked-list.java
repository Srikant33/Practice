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
    public ListNode rev(ListNode head, ListNode prev){
        if (head.next==null){
            head.next=prev;
            return head;
        }
        ListNode next=head.next;
        head.next=prev;
        return rev(next, head);
    }
    public ListNode reverseList(ListNode head) {
        if (head==null || head.next ==null){
            return head;
        }
        return rev(head, null);
    }
}