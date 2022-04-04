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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode front=null;
        ListNode back=null;
        ListNode cur=head;
        int len=0;
        while (cur!=null){
            len++;
            if(back!=null){
                back=back.next;
            }
            if (len==k){
                front=cur;
                back=head;
            }
            cur=cur.next;
        }
        int temp= front.val;
        front.val=back.val;
        back.val=temp;
        return head;
        
        
        
    }
}