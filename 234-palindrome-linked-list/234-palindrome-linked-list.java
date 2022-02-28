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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st= new Stack<ListNode>();
        ListNode a=head;
        while (a!=null){
            st.push(a);
            a=a.next;
        }
        boolean ret= true;
        while (head!=null){
            if(head.val!=st.pop().val){
                ret=false;
            }
            head=head.next;
        }
        return ret;
        
    }
}