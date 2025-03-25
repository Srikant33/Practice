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
    public ListNode reverseList(ListNode head) {
        // if 1 or no elements 
        if (head == null || head.next ==null ){
            return head;
        }   

        // Other nodes to store values 
        ListNode prev = new ListNode();
        ListNode curr = new ListNode();
        ListNode next = new ListNode();

        //initialiszation
        prev = null;
        curr = head; 
        // next = head.next;

        // traversing 
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        } 

        //returning the reersed list
        return prev;
    }
}