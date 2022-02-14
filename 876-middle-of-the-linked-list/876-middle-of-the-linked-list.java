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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode a=head;
        while (head.next!=null){
            count++;
            head=head.next;
        }
        System.out.println(count+1);
        for (int i=0;i<(count+1)/2; i++){
            a=a.next;
        }
        return a;
    }
}