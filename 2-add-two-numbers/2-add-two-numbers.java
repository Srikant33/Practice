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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first=new ListNode();
        ListNode ret=first;
        int carry=0;
        while (l1!=null && l2!=null){
            int temp =l1.val+l2.val+carry;
            ListNode second=new ListNode(temp%10);
            carry=temp/10;
            first.next=second;
            first=first.next;
            l1=l1.next;
            l2=l2.next;
        }
        if (l1==null){
            while (l2!=null){
                int temp =l2.val+carry;
                ListNode second=new ListNode(temp%10);
                carry=temp/10;
                first.next=second;
                first=first.next;
                l2=l2.next;
            }
        } 
        else if (l2==null) 
        {
            while (l1!=null){
                int temp =l1.val+carry;
                ListNode second=new ListNode(temp%10);
                carry=temp/10;
                first.next=second;
                first=first.next;
                l1=l1.next;
            }
        } 
        if (carry!=0){
                int temp = carry;
                ListNode second=new ListNode(temp%10);
                carry=temp/10;
                first.next=second;
                first=first.next;
        }
        return ret.next;
    }
}