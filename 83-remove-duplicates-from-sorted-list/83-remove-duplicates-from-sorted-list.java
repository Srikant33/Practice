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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        ListNode ret = head;
        
        while (head!=null){
            if (p.val == head.val){
                p.next=head.next;
            }
            else{
                p=head;
            }
            head=head.next;
        }
        
        return ret;
    }
}